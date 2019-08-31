package rose;

/**
 * @description:
 * @author: Deng
 * @create: 2019-08-19
 */
public class ItemStrategyFactory {

    static ItemStrategy createItemStrategy(String name) {
        switch (name) {
            case "Aged Brie":
                return new AgedStrategy();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstageStrategy();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasStrategy();
            default:
                return new NormalStrategy();
        }
    }
}
