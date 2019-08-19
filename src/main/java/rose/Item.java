package rose;

/**
 * @description:
 * @author: Deng
 * @create: 2019-08-19
 */
public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public ItemStrategy strategy;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        getItemStrategy(name);
    }

    private void getItemStrategy(String name) {
        strategy = ItemStrategyFactory.createItemStrategy(name);
    }

    public void updateQuality() {
        strategy.update(this);
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
