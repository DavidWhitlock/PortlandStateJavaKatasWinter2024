package edu.pdx.cs410J.pair2;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class LagsTest
{


  @Test
  void canInstantiateKataClass() {
    new Lags();
  }

  @Test
  void testFlightToString(){
    Flight flight = new Flight(2, 5, 10, "AF514");

    assertThat(flight.toString(), containsString("AF514 2 5 10"));
  }

  @Test
  void testFlightConflict() {
    Flight flight = new Flight(2, 5, 10, "AF514");
    Flight flight2 = new Flight(5, 6, 10, "AF514");
    assertThat(flight.checkOverlap(flight2), equalTo(true));
  }
}
