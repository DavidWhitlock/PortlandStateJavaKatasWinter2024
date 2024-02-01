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

}
