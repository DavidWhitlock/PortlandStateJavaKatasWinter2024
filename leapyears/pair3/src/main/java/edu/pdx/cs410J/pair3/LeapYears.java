package edu.pdx.cs410J.pair3;

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

  public static boolean usesGregorianCalendar(int year) {
    return year > 1582;
  }

  public static boolean isLeapYear() {
    throw new IllegalArgumentException();
  }
}

