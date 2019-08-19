package rose;

/**
 * @description:
 * @author: Deng
 * @create: 2019-08-19
 */
public class Rose {

    Item[] items;

    public Rose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            preHandleItem(items[i]);

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                handleItemWithSellInSmallerThanZero(items[i]);
            }
        }
    }

    private void preHandleItem(Item item) {
        if (!item.name.equals("Aged Brie")
                && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.quality -= item.quality > 0 ? 1 : 0;
            }
        } else {
            if (item.quality >= 50) {
                return;
            }

            item.quality = item.quality + 1;

            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.sellIn < 11) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }

                if (item.sellIn < 6) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }
        }
    }

    private void handleItemWithSellInSmallerThanZero(Item item) {
        if (item.name.equals("Aged Brie")) {
            item.quality += item.quality < 50 ? 1 : 0;
            return;
        }

        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            item.quality = 0;
            return;
        }

        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.quality -= item.quality > 0 ? 1 : 0;
        }


    }
}
