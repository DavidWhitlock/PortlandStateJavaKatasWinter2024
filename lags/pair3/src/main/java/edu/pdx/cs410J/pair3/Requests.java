package edu.pdx.cs410J.pair3;

import java.util.Comparator;

public class Requests implements Comparable<Requests> {


    String plane;
    int begin;
    int end;
    int duration;
    int price;


    public Requests(String plane, int begin, int duration, int price) {
        this.plane = plane;
        this.begin = begin;
        this.end = begin + duration;
        this.duration = duration;
        this.price = price;
    }


    public String getPlane() {
        return this.plane;
    }

    public int getBegin() {
        return this.begin;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getPrice() {
        return this.price;
    }

    public int getEnd() {
        return this.end;
    }

    @Override
    public int compareTo(Requests o2) {
        return this.getEnd() - o2.getEnd();
    }
}
