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

  public String parseString(String whole_string) {
    String[] threelines = whole_string.split("\n");
    StringBuilder output = new StringBuilder();
    for(int i = 0; i < threelines[0].length() ; i += 3)
    {
       String digit = threelines[0].substring(i,i+3) + "\n" + threelines[1].substring(i,i+3) + "\n" + threelines[2].substring(i,i+3) + "\n";
       output.append(firstString(digit));
    }
    return output.toString();
  }
  public String firstString(String zero) {
    String[] zeroArray = zero.split("\n");
    if (zeroArray[0].equals(" _ ") && zeroArray[1].equals("| |") && zeroArray[2].equals("|_|")) {
      return "0";
    }
    else if(zeroArray[0].equals("   ") && zeroArray[1].equals("  |") && zeroArray[2].equals("  |")){
      return "1";
    }
    else if(zeroArray[0].equals(" _ ") && zeroArray[1].equals(" _|") && zeroArray[2].equals("|_ ")){
      return "2";
    }
    else if(zeroArray[0].equals(" _ ") && zeroArray[1].equals(" _|") && zeroArray[2].equals(" _|")){
      return "3";
    }
    else if(zeroArray[0].equals("   ") && zeroArray[1].equals("|_|") && zeroArray[2].equals("  |")){
      return "4";
    }
    else if(zeroArray[0].equals(" _ ") && zeroArray[1].equals("|_ ") && zeroArray[2].equals(" _|")){
      return "5";
    }
    else if(zeroArray[0].equals(" _ ") && zeroArray[1].equals("|_ ") && zeroArray[2].equals("|_|")){
      return "6";
    }
    else if(zeroArray[0].equals(" _ ") && zeroArray[1].equals("  |") && zeroArray[2].equals("  |")){
      return "7";
    }
    else if(zeroArray[0].equals(" _ ") && zeroArray[1].equals("|_|") && zeroArray[2].equals("|_|")){
      return "8";
    }
    else if(zeroArray[0].equals(" _ ") && zeroArray[1].equals("|_|") && zeroArray[2].equals(" _|")){
      return "9";
    }
    else {
      return "?";
    }
  }

  public int getChecksum(String whole) {
    String parsedString = parseString(whole);
    int a = 0;
    for(int i = 0; i < parsedString.length(); i++)
    {
      int charVal = Integer.parseInt(String.valueOf(parsedString.charAt(8 - i)));
      a += charVal * (i + 1);
    }
    return a % 11;
  }

  public String printFile(String whole) {
    String[] splitFile = whole.split("\n");
    StringBuilder builder = new StringBuilder();
    for(int i = 0; i < splitFile.length; i += 4)
    {
      String testString = splitFile[i] + "\n" + splitFile[i + 1] + "\n" + splitFile[i + 2];
      String parsedString = parseString(testString);
      if(parsedString.contains("?")) {
        parsedString += " ILL";
      } else if(getChecksum(testString) != 0) {
        parsedString += " ERR";
      }

      builder.append(parsedString).append("\n");
    }
    return builder.toString();
  }
}