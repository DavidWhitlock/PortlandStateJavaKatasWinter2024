package edu.pdx.cs410J.pair1;

import com.google.common.annotations.VisibleForTesting;

import javax.management.InvalidAttributeValueException;

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

  public static String leapYears(int year) {
    if (year <= 0) {
      throw new IllegalArgumentException("Year was less than 0");
    }
    if (year % 400 == 0)
      return "Leap";

    if (year % 100 == 0 && year % 400 != 0)
      return "Not Leap";

    return null;

  }
}