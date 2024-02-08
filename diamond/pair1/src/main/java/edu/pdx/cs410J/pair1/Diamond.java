package edu.pdx.cs410J.pair1;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {



  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static void diamond(String letter) {
    if (letter.length() != 1){
      throw new IllegalArgumentException("Error: Argument is not of length 1");
    }

    letter = letter.toUpperCase();
    char ch = letter.charAt(0);
    if (ch < 'A' || ch > 'Z') {
      throw new IllegalArgumentException("Invalid character");
    }

    int preSpace = 0;
    int space = 0;


  }
}