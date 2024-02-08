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
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
      return;
    }
    if (args.length > 1)
    {
      System.err.println("Too many arguments!");
      return;
    }
    try {
      int year = Integer.parseInt(args[0]);
      if(isLeapYear(year)) {
        System.out.println("Is a Leap Year!");
      }
      else {
        System.out.println("Is not a Leap Year!");
      }
    } catch (NumberFormatException e){
      System.err.println("Not a number");
    } catch (IllegalArgumentException e){
      System.err.println("Year cannot be negative!");
    }

  }

  public static boolean usesGregorianCalendar(int year) {
    return year > 1582;
  }

  public static boolean isLeapYear(int year) {
    if (year < 0){
      throw new IllegalArgumentException();
    }
    if (usesGregorianCalendar(year)) {
      return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    } else {
      return year % 4 == 0;
    }
  }
}

