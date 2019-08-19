package rose;

/**
 * @description:
 * @author: Deng
 * @create: 2019-08-19
 */
public class BackstageStrategy implements ItemStrategy {

    public void update(Item item) {
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
