package edu.pdx.cs410J.mob2;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class BankOCR {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public int firstString(String zero) {
    String[] zeroArray = zero.split("\n");
    if (zeroArray[0].equals(" _ ") && zeroArray[1].equals("| |") && zeroArray[2].equals("|_|")) {
      return 0;
    }
    else if(zeroArray[0].equals("   ") && zeroArray[1].equals("  |") && zeroArray[2].equals("  |")){
      return 1;
    }
    return -1;
  }
}