package edu.pdx.cs410J.pair1;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class LeapYearsTest
{
  @Test
  void numberLessThan0PrintsErrorToStandardError() {
    int number = -1;
    assertThrows(IllegalArgumentException.class, () -> LeapYears.leapYears(number));
  }

  @Test
  void year2000IsOkay() {
    int year = 2000;
    LeapYears.leapYears(year);
  }

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

}
