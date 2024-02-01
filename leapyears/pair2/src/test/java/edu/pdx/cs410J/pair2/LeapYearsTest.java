package edu.pdx.cs410J.pair2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void enter400returnTrue() {
      int number = 400;
      assertThat(LeapYearCalc., equalTo("Number is too large"));
    }
}
