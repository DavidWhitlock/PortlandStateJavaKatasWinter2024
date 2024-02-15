package edu.pdx.cs410J.pair3;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LagsTest
{

  @Test
  void canInstantiateKataClass() {
    new Lags();
  }

  @Test
  void sortTest() {
    Requests r1 = new Requests("1", 1, 8, 3);
    Requests r2 = new Requests("2", 1,3,5);
    Requests r3 = new Requests("3", 4, 5, 6);
    Requests[] array = {r1, r2, r3};
    Arrays.sort(array);
    Requests[] expected = {r2,r3,r1};
    //assertTrue(expected.equals(array));
  }
}
