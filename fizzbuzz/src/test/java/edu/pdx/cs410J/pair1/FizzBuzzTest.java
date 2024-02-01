package edu.pdx.cs410J.pair1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest
{

  @Test
  void aNumberOf200IsTooBig() {
    int number = 200;
    assertThrows(IllegalArgumentException.class,
      () -> FizzBuzz.fizzBuzz(number));
  }

  @Test
  void aNumberOf99IsOkay() {
    int number = 99;
    FizzBuzz.fizzBuzz(number);
  }

  @Test
  void number3ReturnFizz() {
    assertThat(FizzBuzz.fizzBuzz(3), equalTo("Fizz"));
  }
  @Test
  void number6ReturnFizz() {
    assertThat(FizzBuzz.fizzBuzz(6), equalTo("Fizz"));
  }
  @Test
  void number5ReturnBuzz() {
    assertThat(FizzBuzz.fizzBuzz(5), equalTo("Buzz"));
  }
  @Test
  void number10ReturnBuzz() {
    assertThat(FizzBuzz.fizzBuzz(10), equalTo("Buzz"));
  }
  @Test
  void Number1Return1() {
    assertThat(FizzBuzz.fizzBuzz(1), equalTo("1"));
  }

  @Test
  void Number2Return2() {
    assertThat(FizzBuzz.fizzBuzz(2), equalTo("2"));
  }

  @Test
  void Number15ReturnFizzBuzz() {
    assertThat(FizzBuzz.fizzBuzz(15), equalTo("FizzBuzz"));
  }

  @Test
  void canInstantiateKataClass() {
    new FizzBuzz();
  }

}
