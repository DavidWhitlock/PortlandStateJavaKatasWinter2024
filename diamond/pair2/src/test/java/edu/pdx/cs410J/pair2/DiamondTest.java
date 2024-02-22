package edu.pdx.cs410J.pair2;

import org.junit.jupiter.api.Test;

import static java.lang.Character.toUpperCase;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void returnUpperCaseArg() {
    char a = 'a';
    assertEquals(toUpperCase(a)== 'A', true);
  }

  @Test
  void calcRows(){
    char c = 'C';
    int rows = (c - 'A') * 2 +1;
    assertEquals(rows, 5);

    char d = 'D';
    int rows2 = (d - 'A') * 2 +1;
    assertEquals(rows2, 7);
  }


}
