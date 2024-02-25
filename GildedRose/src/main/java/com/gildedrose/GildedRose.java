package com.gildedrose;

public class GildedRose {
    static final String AGED_BRIE = "Aged Brie";
    static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            String name = item.name;

//            switch (name) {
//                case AGED_BRIE:
//                    break;
//                    item.sellIn--;
//                    if (item.quality < 50) {
//                        item.quality++;
//                    }
//                    return;
//                case BACKSTAGE_PASS:
//                    break;
//                    if (item.quality <= 50) {
//                        if (item.sellIn <= 0) {
//                            item.quality = 0;
//
//                        } else if (item.sellIn <= 5) {
//                            item.quality += 3;
//
//                        } else if (item.sellIn <= 10) {
//                            item.quality += 2;
//
//                        } else {
//                            item.quality++;
//                        }
//                    }
//                    item.sellIn--;
//                    return;
//                case SULFURAS:
//                    break;
//                default:
//                    item.sellIn--;
//                    if (item.sellIn >= 0) {
//                        item.quality--;
//
//                    } else {
//                        item.quality -= 2;
//                    }
//                    if (item.quality < 0) {
//                        item.quality = 0;
//                    }
//                    continue;
//            }

            if (!name.equals(AGED_BRIE) && !name.equals(BACKSTAGE_PASS)) {
                if (item.quality > 0) {
                    if (!name.equals(SULFURAS)) {
                        item.quality = item.quality - 1;
                    }
                }
            } else {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;

                    if (name.equals(BACKSTAGE_PASS)) {
                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }
                    }
                }
            }

            if (!name.equals(SULFURAS)) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (!name.equals(AGED_BRIE)) {
                    if (!name.equals(BACKSTAGE_PASS)) {
                        if (item.quality > 0) {
                            if (!name.equals(SULFURAS)) {
                                item.quality = item.quality - 1;
                            }
                        }
                    } else {
                        item.quality = 0;
                    }
                } else {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }
        }
    }


}