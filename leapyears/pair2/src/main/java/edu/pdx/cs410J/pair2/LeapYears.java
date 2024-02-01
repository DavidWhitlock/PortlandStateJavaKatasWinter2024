package edu.pdx.cs410J.pair2;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static String LeapYearCalc(int number){
    if(number % 400 == 0) {
      return "Leap Year";
    }
    return "Empty";

  }
}
