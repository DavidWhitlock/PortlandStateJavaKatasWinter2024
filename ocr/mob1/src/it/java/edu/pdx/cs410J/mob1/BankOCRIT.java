package edu.pdx.cs410J.mob1;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class BankOCRIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(BankOCR.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Disabled
  @Test
  void fileCanBeReadFromMain() {
    InputStream myStream = BankOCR.class.getResourceAsStream("oneTest.txt");

    try (BufferedReader reader = new BufferedReader(new InputStreamReader(myStream))){
      String line;
      while ((line = reader.readLine()) != null) {

      }
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

      InvokeMainTestCase.MainMethodResult result = invokeMain(BankOCR.class);
  }

}
