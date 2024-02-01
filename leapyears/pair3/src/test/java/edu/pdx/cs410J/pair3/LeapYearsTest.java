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

  @Test
  void year2000IsLeapYear()
  {
    assertTrue(LeapYears.isLeapYear(2000));
  }

  @Test
  void year2400IsLeapYear()
  {
    assertTrue(LeapYears.isLeapYear(2400));
  }

  @Test
  void year1700IsNotALeapYear()
  {
    assertFalse(LeapYears.isLeapYear(1700));
  }
  @Test
  void year1800IsNotALeapYear()
  {
    assertFalse(LeapYears.isLeapYear(1800));
  }
  @Test
  void year1900IsNotALeapYear()
  {
    assertFalse(LeapYears.isLeapYear(1900));
  }
  @Test
  void year2100IsNotALeapYear()
  {
    assertFalse(LeapYears.isLeapYear(2100));
  }

  @Test
  void year2008IsLeapYear(){
    assertTrue(LeapYears.isLeapYear(2008));
  }
}
