package edu.pdx.cs410J.mob2;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RPNCalculatorIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }
  @Test
  void stringParserOutputsValidStrings() {
    String RPN = "20 5 /";
    Expression e = new Expression();
    String[] actual = e.stringParser(RPN);
    String[] expected = {"20", "5", "/"};
    assertThat(Arrays.equals(actual, expected), equalTo(true));

  }

  @Test
  void TwentyDividedBy5Is4(){
    Expression e = new Expression();
    int num = e.calculate(20, 5, "/");
    assertEquals(num, 4);

  }

}
