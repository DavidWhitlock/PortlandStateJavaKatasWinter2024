package edu.pdx.cs410J.pair2;

import com.google.common.annotations.VisibleForTesting;

import java.util.Collection;
import java.util.List;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Lags {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public int getProfit(Collection<Flight> flights) {

    return 0;
  }
  public static boolean checkOverlap(List<Flight> flights) {
    boolean ans = false;
    for (int i = 0; i < flights.size(); i++) {
      for (int j = 0; j < flights.size(); j++) {
        if (flights.get(i).checkOverlap(flights.get(j))){
          return true;
        }
      }
    }
    return false;
  }
}