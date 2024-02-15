package edu.pdx.cs410J.pair3;

public class Requests {
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
}
