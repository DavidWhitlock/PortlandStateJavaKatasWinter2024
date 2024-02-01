package edu.pdx.cs410J.pair1;

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
  void invokingMainYear2000PrintsLeapYear() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "2000");
    assertThat(result.getTextWrittenToStandardOut(), containsString("Leap"));
  }

  @Test
  void invokingMainYear317isNotALeapYear() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "317");
    assertThat(result.getTextWrittenToStandardOut(), containsString("Not Leap"));
  }


}
