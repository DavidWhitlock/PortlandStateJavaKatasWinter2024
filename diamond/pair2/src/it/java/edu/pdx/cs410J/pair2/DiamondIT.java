package edu.pdx.cs410J.pair2;

import edu.pdx.cs410J.InvokeMainTestCase;
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
  void gDiamondValid() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class,"g");
    String diamond = "      A\n" +
            "     B B\n" +
            "    C   C\n" +
            "   D     D\n" +
            "  E       E\n" +
            " F         F\n" +
            "G           G\n" +
            " F         F\n" +
            "  E       E\n" +
            "   D     D\n" +
            "    C   C\n" +
            "     B B\n" +
            "      A";
    assertThat(assertThat(result.getTextWrittenToStandardOut(), containsString(diamond)));
  }


}
