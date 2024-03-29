package edu.pdx.cs410J.mob1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    assertThat(rpn.result(), equalTo(17.));
  }

  @Test
  void NineEightMinusGivesOne() {
    String test = "9 8 -";
    RPNCalculator rpn = new RPNCalculator(test);

    assertThat(rpn.result(), equalTo(1.));

  }

  @Test
  void NineTimesEightEquals72() {
    RPNCalculator rpn = new RPNCalculator("9 8 *");

    assertThat(rpn.result(), equalTo(72.));
  }

  @Test
  void seventytwoDevidedBy2is36() {
    RPNCalculator rpn = new RPNCalculator("72 2 /");

    assertThat(rpn.result(), equalTo(36.));
  }

  @Test
  void funkyTest() {
    RPNCalculator rpn = new RPNCalculator("4 2 + 3 -");

    assertThat(rpn.result(), equalTo(3.));
  }

  @Test
  void bigGuyTest() {
    RPNCalculator rpn = new RPNCalculator("3 5 8 * 7 + *");

    assertThat(rpn.result(), equalTo(141.));
  }

  @Test
  void sqrtOf9Is3(){
    RPNCalculator rpn = new RPNCalculator("9 SQRT");

    assertThat(rpn.result(), equalTo(3.));
  }

  @Test
  void bunchOfNumbersForNegativeMax(){
    RPNCalculator rpn = new RPNCalculator("-5 -10 -15 MAX");

    assertThat(rpn.result(), equalTo(-5.));
  }
  @Test
  void bunchOfNumbersForMax(){
    RPNCalculator rpn = new RPNCalculator("1 2 3 4 10 MAX");

    assertThat(rpn.result(), equalTo(10.));
  }

  @Test
  void complicatedMaxTest(){
    RPNCalculator rpn = new RPNCalculator("1 2 3 4 10 MAX 1 +");
    assertThat(rpn.result(), equalTo(11.));


    rpn = new RPNCalculator("4 5 MAX 1 +");
    assertThat(rpn.result(), equalTo(6.));
  }

  @Test
  void maxNoValues(){
    IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
      RPNCalculator rpn = new RPNCalculator("MAX");
    });

    assertThat(e.getMessage(), equalTo("Missing Operands for max."));
  }

}
