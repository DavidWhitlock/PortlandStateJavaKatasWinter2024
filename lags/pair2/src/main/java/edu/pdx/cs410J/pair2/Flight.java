package edu.pdx.cs410J.pair2;

public class Flight {

    public int startTime;

    public int duration;

    public int payment;

    public String flightName;
    Flight(int inStartTime, int inDuration, int inPayment, final String flightName){
        this.startTime = inStartTime;
        this.duration = inDuration;
        this.payment = inPayment;
        this.flightName = flightName;
    }

    @Override
    public String toString() {
        return this.flightName + " " + this.startTime + " " + this.duration + " " + this.payment;
    }

    public boolean checkOverlap(Flight otherFlight) {
        return false;
    }
}
