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
  void enter400returnLeap() {
      int number = 400;
      //LeapObject = new LeapYearCalc(number);
      assertThat(LeapYears.leapYear(number), equalTo("Leap Year"));
    }
    @Test
    void enter401returnNonLeap() {
        int number = 401;
        //LeapObject = new LeapYearCalc(number);
        assertThat(LeapYears.leapYear(number), equalTo("Non Leap Year"));
    }
    @Test
    void enter1200returnLeap() {
        int number = 1200;
        //LeapObject = new LeapYearCalc(number);
        assertThat(LeapYears.leapYear(number), equalTo("Leap Year"));
    }
    @Test
    void enter2008returnLeap() {
        int number = 2008;
        //LeapObject = new LeapYearCalc(number);
        assertThat(LeapYears.leapYear(number), equalTo("Leap Year"));
    }
    @Test
    void enter1700returnNonLeap() {
        int number = 1700;
        //LeapObject = new LeapYearCalc(number);
        assertThat(LeapYears.leapYear(number), equalTo("Non Leap Year"));
    }

    @Test
    void enter4returnLeap() {
        int number = 4;
        //LeapObject = new LeapYearCalc(number);
        assertThat(LeapYears.leapYear(number), equalTo("Leap Year"));
    }

    @Test
    void enter2019returnNonLeap() {
        int number = 2019;
        //LeapObject = new LeapYearCalc(number);
        assertThat(LeapYears.leapYear(number), equalTo("Non Leap Year"));
    }
}
