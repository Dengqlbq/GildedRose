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

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros") && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert") && !items[i].name.equals("Aged Brie")) {
                handleNormalItem(items[i]);
            }

            if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                handleBackstageItem(items[i]);
            }

            if (items[i].name.equals("Aged Brie")) {
                handleAgedItem(items[i]);
            }
        }
    }

    private void handleNormalItem(Item item) {
        item.sellIn -= 1;
        item.quality -= item.quality > 0 ? 1 : 0;
        if (item.sellIn < 0) {
            item.quality -= item.quality > 0 ? 1 : 0;
        }
    }

    private void handleAgedItem(Item item) {
        item.sellIn -= 1;
        if (item.quality < 50) {
            item.quality += 1;
        }
        item.quality += item.quality < 50 ? 1 : 0;
    }

    private void handleBackstageItem(Item item) {
        item.sellIn -= 1;
        if (item.quality < 50) {
            item.quality += 1;
        }

        if (item.sellIn < 0) {
            item.quality -= item.quality > 0 ? 1 : 0;
        }

        if (item.quality < 50) {
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

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
