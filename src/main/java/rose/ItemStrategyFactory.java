package rose;

/**
 * @description:
 * @author: Deng
 * @create: 2019-08-19
 */
public class ItemStrategyFactory {

    static ItemStrategy createItemStrategy(String name) {
        if ("Aged Brie".equals(name)) {
            return new AgedStrategy();
        } else if ("Backstage passes to a TAFKAL80ETC concert".equals(name)) {
            return new BackstageStrategy();
        } else if ("Sulfuras, Hand of Ragnaros".equals(name)) {
            return new SulfurasStrategy();
        }
        return new NormalStrategy();
    }
}
