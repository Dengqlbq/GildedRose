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
        for (Item item : items) {
            item.updateQuality();
        }
    }
}
