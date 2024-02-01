package edu.pdx.cs410J.pair3;

import org.junit.jupiter.api.Test;

import static edu.pdx.cs410J.pair3.LeapYears.usesGregorianCalendar;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void acceptsYearAfter1582() {
    assertTrue(usesGregorianCalendar(1583));
  }

  @Test
  void yearIsNotNegative() {
    assertThrows(IllegalArgumentException.class, () -> LeapYears.isLeapYear());
  }

}
