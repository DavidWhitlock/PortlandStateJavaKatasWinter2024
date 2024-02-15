package edu.pdx.cs410J.pair1;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Lags {

  @VisibleForTesting
  public static void main(String[] args) {
    int num_flights = Integer.parseInt(args[0]);
    String[] flights = new String[num_flights];
    for(int i = 0; i < num_flights; i++)
    {
      flights[i] = args[i+1];
    }
    Trip[] trips = new  Trip[num_flights];
    String ID = null;

    for(int i = 0; i < num_flights; i++) {
      String[] flight_details = flights[i].split(" ");
      Trip  trip = new Trip(flight_details[0], Integer.parseInt(flight_details[1]), Integer.parseInt(flight_details[2]), Integer.parseInt(flight_details[3]));
      trips[i] = trip;
      trips[i].print_trip();
    }
    int max_money = 0;
    int money = 0;
    for(int i = 0; i < num_flights; i++) {
      for(int j = i + 1; j < num_flights; j++) {
        money = trips[i].Comparetrip(trips[j]);
        if (money >= max_money) {
          max_money = money;
        }
      }
    }
    for(int i = 0; i < num_flights; i++) {
      if (trips[i].get_cost() > max_money) {
        max_money = trips[i].get_cost();
      }
    }
    System.out.println("Max Profit: $" + max_money);
  }



}