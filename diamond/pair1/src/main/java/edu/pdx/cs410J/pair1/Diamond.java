package edu.pdx.cs410J.pair1;

import com.google.common.annotations.VisibleForTesting;

import java.util.Arrays;

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
    diamond(args[0]);
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

    preSpace = ch - 'A';
    //space =
    char[] charArray = new char[2 * (ch - 'A') + 1];

    Arrays.fill(charArray, ' ');

    int mid = ch - 'A';
    int minus1 = mid;
    int plus1 = mid;
    char pyramidLetter = 'A';

    while (minus1 != 0) {
      charArray[minus1] = pyramidLetter;
      charArray[plus1] = pyramidLetter;
      minus1--;
      plus1++;
      pyramidLetter++;
    }
    System.out.println(charArray);


  }
}