package edu.pdx.cs410J.pair2;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class LeapYearsIT extends InvokeMainTestCase {

  @Disabled
  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void invokingMainWithCorrectArgumentsPrintsLeapYear() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "4");
    assertThat(result.getTextWrittenToStandardOut(), containsString("Leap Year"));
  }

  @Test
  void invokingMainWithCorrectArgumentsPrintsNonLeapYear() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "2018");
    assertThat(result.getTextWrittenToStandardOut(), containsString("Non Leap Year"));
  }

  @Test
  void invokingMainWithTooManyArgumentsPrintsTooManyArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "2000", "2000");
    assertThat(result.getTextWrittenToStandardError(), containsString("Too many arguments!"));
  }
}
