package edu.pdx.cs410J.pair3;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class LeapYearsIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void testCorrectCommandLineArgument() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "2400");
    assertThat(result.getTextWrittenToStandardOut(), containsString("Is a Leap Year!"));
  }

  @Test
  void test2019NotLeapYear() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "2019");
    assertThat(result.getTextWrittenToStandardOut(), containsString("Is not a Leap Year!"));
  }

  @Test
  void test1201NotLeapYear() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "1201");
    assertThat(result.getTextWrittenToStandardOut(), containsString("Is not a Leap Year!"));
  }

  @Test
  void test1200LeapYear() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "1200");
    assertThat(result.getTextWrittenToStandardOut(), containsString("Is a Leap Year!"));
  }
  @Test
  void testTwoArguments() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "2020", "word");
    assertThat(result.getTextWrittenToStandardError(), containsString("Too many arguments!"));
  }

  @Test
  void testNegativeYear()
  {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "-2020");
    assertThat(result.getTextWrittenToStandardError(), containsString("Year cannot be negative!"));
  }



  @Test
  void notANumberArg(){
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "word");
    assertThat(result.getTextWrittenToStandardError(), containsString("Not a number"));
  }

}
