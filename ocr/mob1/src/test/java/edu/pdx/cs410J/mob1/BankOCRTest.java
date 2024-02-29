package edu.pdx.cs410J.mob1;

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
  void arrayOneisOne(){
    String[] oneArray = {"   ", "  |", "  |"};
    Digit digitOne = new Digit(oneArray);

    assertThat(digitOne.getNum(), equalTo(1));
  }


}
