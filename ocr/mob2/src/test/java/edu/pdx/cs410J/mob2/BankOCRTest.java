package edu.pdx.cs410J.mob2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BankOCRTest
{

  @Test
  void canInstantiateKataClass() {
    new BankOCR();
  }

  @Test
  void characterIsZeroReturnsZero() {
    BankOCR bankOCR = new BankOCR();
    String zero = " _ \n" +
            "| |\n" +
            "|_|\n";
    assertThat(bankOCR.firstString(zero), equalTo(0));
  }

  @Test
  void characterIsOneReturnsOne() {
    BankOCR bankOCR = new BankOCR();
    String one = "   \n" +
            "  |\n" +
            "  |\n";
    assertThat(bankOCR.firstString(one), equalTo(1));
  }

}
