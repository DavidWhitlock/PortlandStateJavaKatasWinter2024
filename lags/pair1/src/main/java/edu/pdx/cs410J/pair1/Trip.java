package edu.pdx.cs410J.pair1;

public class Trip {
    private String  ID;
    private int start;
    private int end;
    private int   payment;

    Trip() {
        this.ID = null;
        this.start = 0;
        this.end = 0;
        this.payment = 0;

    }
    Trip(String ID, int start, int end, int payment) {
        this.ID = ID;
        this.start = start;
        this.end = end;
        this.payment = payment;
    }

    public int get_cost() {
        return this.payment;
    }

    public int  Comparetrip(Trip to_compare) {
        if (this.end < to_compare.start) {
            return (this.payment + to_compare.payment);
        } else if (to_compare.end < this.start) {
            return (this.payment + to_compare.payment);
        }
        else {
            return 0;
        }
    }

    public void print_trip() {
        System.out.println("ID: " + this.ID);
        System.out.println("Start: " + this.start);
        System.out.println("End: " + this.end);
        System.out.println("Payment: $" + this.payment);
    }
}
