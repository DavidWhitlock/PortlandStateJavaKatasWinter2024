package edu.pdx.cs410J.pair2;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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

    // overlap
    // 2 to 7
    Flight flight = new Flight(2, 5, 10, "AF514");
    // 5 to 11
    Flight flight2 = new Flight(5, 6, 10, "AF514");
    assertThat(flight.checkOverlap(flight2), equalTo(true));

    // no overlap
    // 2 to 3
    flight = new Flight(2, 1, 10, "AF514");
    // 4 to 6
    flight2 = new Flight(4, 2, 10, "AF514");
    assertThat(flight.checkOverlap(flight2), equalTo(false));

    // 2 to 3
    flight = new Flight(2, 1, 10, "AF514");
    // 3 to 6
    flight2 = new Flight(3, 2, 10, "AF514");
    assertThat(flight.checkOverlap(flight2), equalTo(true));

    // 5 to 7
    flight = new Flight(5, 2, 10, "AF514");
    // 3 to 6
    flight2 = new Flight(3, 2, 10, "AF514");
    assertThat(flight.checkOverlap(flight2), equalTo(true));


    // 4 to 6
    flight = new Flight(4, 2, 10, "AF514");
    // 2 to 3
    flight2 = new Flight(2, 1, 10, "AF514");
    assertThat(flight.checkOverlap(flight2), equalTo(false));
  }

  static ArrayList<Flight> flights = new ArrayList<>();
  static int bestCost = 18;
  @BeforeAll
  static void setup()
  {
    //AF514 0 5 10
    //CO5 3 7 14
    //AF515 5 9 7
    //BA01 6 9 8
    flights.add(new Flight(0, 5, 10, "AF514"));
    flights.add(new Flight(3, 7, 14, "C05"));
    flights.add(new Flight(5, 9, 7, "AF515"));
    flights.add(new Flight(6, 9, 8, "BA01"));
  }


}
