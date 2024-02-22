package com.gildedrose;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        String name = "foo";
        Item[] items = new Item[] { new Item(name, 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(name, equalTo(app.items[0].name));
    }

    @Test
    void decreaseQualityByOneDayRegularItem() {
        Item[] items = new Item[] { new Item("Regular Item", 10, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(9));
        assertThat(item.quality, equalTo(19));
    }
    @Test
    void agedBrieIncreasesInQualityWhenThan2DaysLeft(){
        Item[] items = new Item[] { new Item("Aged Brie", 2, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(1));
        assertThat(item.quality, equalTo(1));
    }

    @Test
    void agedBrieHasMaxQualityofFifty(){
        Item[] items = new Item[] { new Item("Aged Brie", 2, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(1));
        assertThat(item.quality, equalTo(50));
    }

}
