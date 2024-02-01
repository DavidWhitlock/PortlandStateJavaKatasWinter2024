package edu.pdx.cs410J.pair3;

import org.junit.jupiter.api.Test;

import static edu.pdx.cs410J.pair3.LeapYears.usesGregorianCalendar;
import static org.junit.jupiter.api.Assertions.*;

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
    assertThrows(IllegalArgumentException.class, () -> LeapYears.isLeapYear(-1));
  }

  @Test
  void year1200IsLeapYear(){
    assertTrue(LeapYears.isLeapYear(1200));
  }


  @Test
  void year1201IsNotLeapYear(){
    assertFalse(LeapYears.isLeapYear(1201));
  }

}
