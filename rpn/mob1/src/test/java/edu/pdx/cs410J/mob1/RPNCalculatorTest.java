package edu.pdx.cs410J.mob1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class RPNCalculatorTest
{

  @Disabled
  @Test
  void canInstantiateKataClass() {
    //new RPNCalculator();
  }

  @Test
  void eightAndNineAddTo17(){
    String test = "8 9 +";
    RPNCalculator rpn = new RPNCalculator(test);

    assertThat(rpn.result(), equalTo(17));
  }

}
