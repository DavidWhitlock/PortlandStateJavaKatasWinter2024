package com.gildedrose;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TexttestFixtureTest {

  private final Item dexterityVest = new Item("+5 Dexterity Vest", 10, 20);
  private final Item agedBrie = new Item("Aged Brie", 2, 0);
  private final Item elixir = new Item("Elixir of the Mongoose", 5, 7);
  private final Item sulfuras1 = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
  private final Item sulfuras2 = new Item("Sulfuras, Hand of Ragnaros", -1, 80);
  private final Item backstagePass1 = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
  private final Item backstagePass2 = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
  private final Item backstagePass3 = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49);
  private final Item conjuredItem = new Item("Conjured Mana Cake", 3, 6);
  private GildedRose gildedRose;

  @BeforeEach
  void setUp() {
    Item[] items = new Item[] {
      dexterityVest, //
      agedBrie, //
      elixir, //
      sulfuras1, //
      sulfuras2,
      backstagePass1,
      backstagePass2,
      backstagePass3,
      // this conjured item does not work properly yet
      conjuredItem};

    gildedRose = new GildedRose(items);
  }

  private void day(int days) {
    for (int day = 0; day < days; day++) {
      gildedRose.updateQuality();
    }
  }

  private void assertItemHasState(Item item, int sellIn, int quality) {
    assertThat(item.name + " sellIn", item.sellIn, equalTo(sellIn));
    assertThat(item.name + " quality", item.quality, equalTo(quality));
  }

  @Test
  void day0() {
    assertItemHasState(dexterityVest, 10, 20);
    assertItemHasState(agedBrie, 2, 0);
    assertItemHasState(elixir, 5, 7);
    assertItemHasState(sulfuras1, 0, 80);
    assertItemHasState(sulfuras2, -1, 80);
    assertItemHasState(backstagePass1, 15, 20);
    assertItemHasState(backstagePass2, 10, 49);
    assertItemHasState(backstagePass3, 5, 49);
    assertItemHasState(conjuredItem, 3, 6);
  }

  @Test
  void day1() {
    day(1);
    assertItemHasState(dexterityVest, 9, 19);
    assertItemHasState(agedBrie, 1, 1);
    assertItemHasState(elixir, 4, 6);
    assertItemHasState(sulfuras1, 0, 80);
    assertItemHasState(sulfuras2, -1, 80);
    assertItemHasState(backstagePass1, 14, 21);
    assertItemHasState(backstagePass2, 9, 50);
    assertItemHasState(backstagePass3, 4, 50);
    assertItemHasState(conjuredItem, 2, 5);
  }

  @Test
  void day2() {
    day(2);
    assertItemHasState(dexterityVest, 8, 18);
    assertItemHasState(agedBrie, 0, 2);
    assertItemHasState(elixir, 3, 5);
    assertItemHasState(sulfuras1, 0, 80);
    assertItemHasState(sulfuras2, -1, 80);
    assertItemHasState(backstagePass1, 13, 22);
    assertItemHasState(backstagePass2, 8, 50);
    assertItemHasState(backstagePass3, 3, 50);
    assertItemHasState(conjuredItem, 1, 4);
  }

  @Test
  void day3() {
    day(3);
    assertItemHasState(dexterityVest, 7, 17);
    assertItemHasState(agedBrie, -1, 4);
    assertItemHasState(elixir, 2, 4);
    assertItemHasState(sulfuras1, 0, 80);
    assertItemHasState(sulfuras2, -1, 80);
    assertItemHasState(backstagePass1, 12, 23);
    assertItemHasState(backstagePass2, 7, 50);
    assertItemHasState(backstagePass3, 2, 50);
    assertItemHasState(conjuredItem, 0, 3);
  }
}
