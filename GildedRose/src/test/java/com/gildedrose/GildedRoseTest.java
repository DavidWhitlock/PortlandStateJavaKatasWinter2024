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
    void regularItemDecreasesInQualityByOneAtTheEndOfTheDay() {
        Item[] items = new Item[] { new Item("Test Item", 10, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(9));
        assertThat(item.quality, equalTo(19));
    }

    @Test
    void agedBrieIncreasesInQualityWhenLessThanTwoDaysBeforeSellInDate() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(1));
        assertThat(item.quality, equalTo(1));
    }

    @Test
    void agedBrieHasAMaximumQualityOf50() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(1));
        assertThat(item.quality, equalTo(50));
    }

    @Test
    @Disabled("Conjured Items don't work yet")
    void conjuredItemHasQualityThatDecreasesByTwo() {
        Item[] items = new Item[] { new Item("Conjured Item", 3, 6) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(2));
        assertThat(item.quality, equalTo(4));
    }

    @Test
    void backstagePassHasQualityOfZeroTheDayAfterSellIn() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 57) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(-1));
        assertThat(item.quality, equalTo(0));
    }

    @Test
    void regularItemHasQualityDecreaseByTwoTheDayAfterSellIn() {
        Item[] items = new Item[] { new Item("Regular Item", 0, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(-1));
        assertThat(item.quality, equalTo(18));
    }

    @Test
    void backstagePassIncreasesQualityByTwo10DaysBeforeSellIn() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20) };
        GildedRose app = new GildedRose(items);
        for (int i = 1; i <= 5; i++) {
            app.updateQuality();
        }

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(5));
        assertThat(item.quality, equalTo(30));
    }

    @Test
    void sulfurasNeverDecreasesInQuality() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(0));
        assertThat(item.quality, equalTo(80));
    }
}
