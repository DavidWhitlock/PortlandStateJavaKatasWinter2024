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
    for(int i = 1; i <101; i++) {
      System.out.println(fizzBuzz(i));
    }
  }

  public static String fizzBuzz(int number) {
    if (number > 100) {
      throw new IllegalArgumentException("Number is too large");
    }
    if (number < 0) {
      throw new IllegalArgumentException("Number is too small");
    }
    if (number%3 == 0 && number%5 == 0) {
      return "FizzBuzz";
    }
    if (number%3 ==0) {
      return "Fizz";
    }
    if (number%5 ==0) {
      return "Buzz";
    }
    return Integer.toString(number);
  }
}