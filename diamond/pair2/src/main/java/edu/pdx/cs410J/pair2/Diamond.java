package edu.pdx.cs410J.pair2;

import com.google.common.annotations.VisibleForTesting;

import static java.lang.Character.toUpperCase;


/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {


    //char temp_char = 'D';

    if (args[0].isEmpty()) {
      System.err.println("Missing command line arguments");

    }
    else {
      char maxLetter = toUpperCase(args[0].charAt(0));
      int middleSpace = outputTop(maxLetter);
      outputBottom(maxLetter, middleSpace);
    }
  }

  public static int outputTop(char maxLetter){

    int rows = (maxLetter - 'A')+1;
    int leftSpace = maxLetter - 'A';
    int middleSpace = 0;
    char printLetter = 'A';

    for (int i=0; i < rows; i++) {

      // Output left spaces
      for (int j=0; j < leftSpace; j++) {
        System.out.print(" ");
      }
      if (printLetter == 'A') System.out.println(printLetter);
      else System.out.print(printLetter);

      if(printLetter != 'A') {
        for (int j=0; j < middleSpace; j++) {
          System.out.print(" ");

        }
        System.out.println(printLetter);
      }
      leftSpace--;
      printLetter++;

      if(middleSpace == 0) middleSpace++;
      else middleSpace+=2;

    }
    return middleSpace;
  }

  public static void outputBottom(char maxLetter, int middleSpace){

    char printLetter = (char) (maxLetter-1);
    int rows = (maxLetter - 'A');
    int leftSpace = 1;
    middleSpace-=4;

    for (int i=0; i < rows; i++) {

      // Output left spaces
      for (int j=0; j < leftSpace; j++) {
        System.out.print(" ");
      }
      if (printLetter == 'A') System.out.println(printLetter);
      else System.out.print(printLetter);

      if(printLetter != 'A') {
        for (int j=0; j < middleSpace; j++) {
          System.out.print(" ");

        }
        System.out.println(printLetter);
      }
      leftSpace++;
      printLetter--;

      if(middleSpace == 0) return;
      else if (middleSpace ==1) middleSpace--;
      else middleSpace -=2;
    }
  }
}