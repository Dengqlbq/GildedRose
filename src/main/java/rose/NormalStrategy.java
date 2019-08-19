package rose;

/**
 * @description:
 * @author: Deng
 * @create: 2019-08-19
 */
public class NormalStrategy implements ItemStrategy {

    public void update(Item item) {
        item.sellIn -= 1;
        item.quality -= item.quality > 0 ? 1 : 0;
        if (item.sellIn < 0) {
            item.quality -= item.quality > 0 ? 1 : 0;
        }
    }
}
