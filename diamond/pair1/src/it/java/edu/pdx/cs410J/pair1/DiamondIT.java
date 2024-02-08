package edu.pdx.cs410J.pair1;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class DiamondIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void firstLineIsCorrect() {
    InvokeMainTestCase.MainMethodResult result = this.invokeMain(Diamond.class, new String[]{"D"});
    MatcherAssert.assertThat(result.getTextWrittenToStandardOut(), StringContains.containsString("   A   "));
  }
  @Test
  void secondLineIsCorrect() {
    InvokeMainTestCase.MainMethodResult result = this.invokeMain(Diamond.class, new String[]{"D"});
    MatcherAssert.assertThat(result.getTextWrittenToStandardOut(), StringContains.containsString("  B B  "));
  }

}
