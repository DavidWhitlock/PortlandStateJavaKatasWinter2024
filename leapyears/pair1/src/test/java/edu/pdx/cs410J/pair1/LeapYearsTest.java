package edu.pdx.cs410J.pair1;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
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
  void year400isALeapYear(){
    int year = 400;
    assertThat(LeapYears.leapYears(year), equalTo("Leap"));
  }
@Test
  void year300isNotALeapYear(){
    int year = 300;
    assertThat(LeapYears.leapYears(year), equalTo("Not Leap"));
  }
@Test
  void year16isALeapYear(){
    int year = 16;
    assertThat(LeapYears.leapYears(year), equalTo("Leap"));
  }

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

}
