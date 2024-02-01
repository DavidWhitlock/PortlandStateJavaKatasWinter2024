package edu.pdx.cs410J.pair1;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class FizzBuzzIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FizzBuzz.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void fizzBuzzOf1Prints1() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FizzBuzz.class, "1");
    assertThat(result.getTextWrittenToStandardOut(), containsString("1"));

  }

  @Test
  void fizzBuzzOf2Prints1And2() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FizzBuzz.class, "2");
    assertThat(result.getTextWrittenToStandardOut(), containsString("1"));
    assertThat(result.getTextWrittenToStandardOut(), containsString("2"));
  }
}
