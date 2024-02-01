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
    if(args.length==0) {
      System.err.println("Missing command line arguments");
    }
    if(args.length>1) {
      System.err.println("Too many arguments!");
    }
  }


  public static String leapYear(int number) {
    if(number % 4 == 0 && number % 100 > 0){
      return "Leap Year";
    }
    if(number % 400 == 0) {
      return "Leap Year";
    }
    return "Non Leap Year";

  }
}
