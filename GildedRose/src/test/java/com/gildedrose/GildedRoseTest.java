package com.gildedrose;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.gildedrose.GildedRose.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    private static GildedRose updateQuality(Item item) {
        Item[] items = new Item[] {item};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app;
    }

    @Test
    void foo() {
        String name = "foo";
        GildedRose app = updateQuality(new Item(name, 0, 0));
        assertThat(name, equalTo(app.items[0].name));
    }

    @Test
    void regularItemDecreasesInQualityByOneAtTheEndOfTheDay() {
        GildedRose app = updateQuality(new Item("Test Item", 10, 20));

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(9));
        assertThat(item.quality, equalTo(19));
    }

    @Test
    void agedBrieIncreasesInQualityWhenLessThanTwoDaysBeforeSellInDate() {
        GildedRose app = updateQuality(new Item(AGED_BRIE, 2, 0));

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(1));
        assertThat(item.quality, equalTo(1));
    }

    @Test
    void agedBrieHasAMaximumQualityOf50() {
        GildedRose app = updateQuality(new Item(AGED_BRIE, 2, 50));

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(1));
        assertThat(item.quality, equalTo(50));
    }

    @Test
    @Disabled("Conjured Items don't work yet")
    void conjuredItemHasQualityThatDecreasesByTwo() {
        GildedRose app = updateQuality(new Item("Conjured Item", 3, 6));

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(2));
        assertThat(item.quality, equalTo(4));
    }

    @Test
    void backstagePassHasQualityOfZeroTheDayAfterSellIn() {
        GildedRose app = updateQuality(new Item(BACKSTAGE_PASS, 0, 57));

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(-1));
        assertThat(item.quality, equalTo(0));
    }

    @Test
    void regularItemHasQualityDecreaseByTwoTheDayAfterSellIn() {
        GildedRose app = updateQuality(new Item("Regular Item", 0, 20));

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(-1));
        assertThat(item.quality, equalTo(18));
    }

    @Test
    void backstagePassIncreasesQualityByTwo10DaysBeforeSellIn() {
        Item[] items = new Item[] { new Item(BACKSTAGE_PASS, 10, 20) };
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
        GildedRose app = updateQuality(new Item(SULFURAS, 0, 80));

        Item item = app.items[0];
        assertThat(item.sellIn, equalTo(0));
        assertThat(item.quality, equalTo(80));
    }
}
