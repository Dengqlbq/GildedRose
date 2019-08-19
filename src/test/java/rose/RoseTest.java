package rose;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoseTest {

    @Test
    public void should_update_item_quality_from_1_to_0_and_sell_in_from_2_to_1_when_name_is_any_and_sell_in_is_2_and_quality_is_1() {
        // given
        Rose rose = new Rose(new Item[]{new Item("any", 2, 1)});

        // when
        rose.updateQuality();

        // then
        assertEquals(0, rose.items[0].quality);
        assertEquals(1, rose.items[0].sellIn);
    }

    @Test
    public void should_not_update_item_quality_but_sell_in_from_2_to_1_when_name_is_any_and_sell_in_is_2_and_quality_is_0() {
        // given
        Rose rose = new Rose(new Item[]{new Item("any", 2, 0)});

        // when
        rose.updateQuality();

        // then
        assertEquals(0, rose.items[0].quality);
        assertEquals(1, rose.items[0].sellIn);
    }

    @Test
    public void should_not_update_item_quality_sell_in_from_2_to_1_when_name_is_any_and_sell_in_is_2_and_quality_is_negative_1() {
        // given
        Rose rose = new Rose(new Item[]{new Item("any", 2, -1)});

        // when
        rose.updateQuality();

        // then
        assertEquals(-1, rose.items[0].quality);
        assertEquals(1, rose.items[0].sellIn);
    }

    @Test
    public void should_not_update_item_quality_sell_in_from_2_to_1_when_name_is_aged_brie_and_sell_in_is_2_and_quality_is_51() {
        // given
        Rose rose = new Rose(new Item[]{new Item("Aged Brie", 2, 51)});

        // when
        rose.updateQuality();

        // then
        assertEquals(51, rose.items[0].quality);
        assertEquals(1, rose.items[0].sellIn);
    }

    @Test
    public void should_not_update_item_quality_sell_in_from_2_to_1_when_name_is_aged_brie_and_sell_in_is_2_and_quality_is_50() {
        // given
        Rose rose = new Rose(new Item[]{new Item("Aged Brie", 2, 50)});

        // when
        rose.updateQuality();

        // then
        assertEquals(50, rose.items[0].quality);
        assertEquals(1, rose.items[0].sellIn);
    }

    @Test
    public void should_update_item_quality_from_49_to_50_sell_in_from_2_to_1_when_name_is_aged_brie_and_sell_in_is_2_and_quality_is_49() {
        // given
        Rose rose = new Rose(new Item[]{new Item("Aged Brie", 2, 49)});

        // when
        rose.updateQuality();

        // then
        assertEquals(50, rose.items[0].quality);
        assertEquals(1, rose.items[0].sellIn);
    }

    @Test
    public void should_update_item_quality_from_49_to_50_sell_in_from_12_to_11_when_name_is_backstage_passes_to_a_TAFKAL80ETC_concert_and_sell_in_is_12_and_quality_is_49() {
        // given
        Rose rose = new Rose(new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 12, 49)});

        // when
        rose.updateQuality();

        // then
        assertEquals(50, rose.items[0].quality);
        assertEquals(11, rose.items[0].sellIn);
    }

    @Test
    public void should_update_item_quality_from_49_to_50_sell_in_from_11_to_10_when_name_is_backstage_passes_to_a_TAFKAL80ETC_concert_and_sell_in_is_11_and_quality_is_49() {
        // given
        Rose rose = new Rose(new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 11, 49)});

        // when
        rose.updateQuality();

        // then
        assertEquals(50, rose.items[0].quality);
        assertEquals(10, rose.items[0].sellIn);
    }

    @Test
    public void should_update_item_quality_from_49_to_50_sell_in_from_10_to_9_when_name_is_backstage_passes_to_a_TAFKAL80ETC_concert_and_sell_in_is_10_and_quality_is_49() {
        // given
        Rose rose = new Rose(new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49)});

        // when
        rose.updateQuality();

        // then
        assertEquals(50, rose.items[0].quality);
        assertEquals(9, rose.items[0].sellIn);
    }

    @Test
    public void should_update_item_quality_from_48_to_50_sell_in_from_10_to_9_when_name_is_backstage_passes_to_a_TAFKAL80ETC_concert_and_sell_in_is_10_and_quality_is_48() {
        // given
        Rose rose = new Rose(new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 48)});

        // when
        rose.updateQuality();

        // then
        assertEquals(50, rose.items[0].quality);
        assertEquals(9, rose.items[0].sellIn);
    }

    @Test
    public void should_update_item_quality_from_49_to_50_sell_in_from_6_to_5_when_name_is_backstage_passes_to_a_TAFKAL80ETC_concert_and_sell_in_is_6_and_quality_is_49() {
        // given
        Rose rose = new Rose(new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 6, 49)});

        // when
        rose.updateQuality();

        // then
        assertEquals(50, rose.items[0].quality);
        assertEquals(5, rose.items[0].sellIn);
    }

    @Test
    public void should_update_item_quality_from_48_to_50_sell_in_from_6_to_5_when_name_is_backstage_passes_to_a_TAFKAL80ETC_concert_and_sell_in_is_6_and_quality_is_48() {
        // given
        Rose rose = new Rose(new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 6, 48)});

        // when
        rose.updateQuality();

        // then
        assertEquals(50, rose.items[0].quality);
        assertEquals(5, rose.items[0].sellIn);
    }

    @Test
    public void should_update_item_quality_from_49_to_50_sell_in_from_5_to_4_when_name_is_backstage_passes_to_a_TAFKAL80ETC_concert_and_sell_in_is_5_and_quality_is_49() {
        // given
        Rose rose = new Rose(new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)});

        // when
        rose.updateQuality();

        // then
        assertEquals(50, rose.items[0].quality);
        assertEquals(4, rose.items[0].sellIn);
    }

    @Test
    public void should_update_item_quality_from_48_to_50_sell_in_from_5_to_4_when_name_is_backstage_passes_to_a_TAFKAL80ETC_concert_and_sell_in_is_5_and_quality_is_48() {
        // given
        Rose rose = new Rose(new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 5, 47)});

        // when
        rose.updateQuality();

        // then
        assertEquals(50, rose.items[0].quality);
        assertEquals(4, rose.items[0].sellIn);
    }

    @Test
    public void should_update_item_quality_from_47_to_50_sell_in_from_5_to_4_when_name_is_backstage_passes_to_a_TAFKAL80ETC_concert_and_sell_in_is_5_and_quality_is_47() {
        // given
        Rose rose = new Rose(new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 5, 47)});

        // when
        rose.updateQuality();

        // then
        assertEquals(50, rose.items[0].quality);
        assertEquals(4, rose.items[0].sellIn);
    }

    @Test
    public void should_update_item_quality_from_50_to_0_sell_in_from_0_to_negative_1_when_name_is_backstage_passes_to_a_TAFKAL80ETC_concert_and_sell_in_is_0_and_quality_is_50() {
        // given
        Rose rose = new Rose(new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50)});

        // when
        rose.updateQuality();

        // then
        assertEquals(0, rose.items[0].quality);
        assertEquals(-1, rose.items[0].sellIn);
    }

    @Test
    public void should_update_item_quality_from_48_to_50_sell_in_from_0_to_negative_1_when_name_is_aged_brie_and_sell_in_is_0_and_quality_is_48() {
        // given
        Rose rose = new Rose(new Item[]{new Item("Aged Brie", 0, 48)});

        // when
        rose.updateQuality();

        // then
        assertEquals(50, rose.items[0].quality);
        assertEquals(-1, rose.items[0].sellIn);
    }

    @Test
    public void should_update_item_quality_from_48_to_46_sell_in_from_0_to_negative_1_when_name_is_any_and_sell_in_is_0_and_quality_is_48() {
        // given
        Rose rose = new Rose(new Item[]{new Item("any", 0, 48)});

        // when
        rose.updateQuality();

        // then
        assertEquals(46, rose.items[0].quality);
        assertEquals(-1, rose.items[0].sellIn);
    }
}