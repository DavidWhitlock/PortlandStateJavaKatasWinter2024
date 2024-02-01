package edu.pdx.cs410J.pair1;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class FizzBuzz {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static String fizzBuzz(int number) {
    if (number > 100) {
      throw new IllegalArgumentException("Number is too large");
    }
    if (number%3 ==0) {
      return "Fizz";
    }
    if (number%5 ==0) {
      return "Buzz";
    }
    return null;
  }
}