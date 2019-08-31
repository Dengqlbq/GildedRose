package rose;

/**
 * @description:
 * @author: Deng
 * @create: 2019-08-19
 */
public class AgedStrategy implements ItemStrategy {

    @Override
    public void update(Item item) {
        item.sellIn -= 1;
        if (item.quality < 50) {
            item.quality += 1;
        }
        item.quality += item.quality < 50 ? 1 : 0;
    }
}
