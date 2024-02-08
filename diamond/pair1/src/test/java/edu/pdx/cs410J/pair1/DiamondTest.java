package edu.pdx.cs410J.pair1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void invalidArgument(){
    String argument = "!";
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      Diamond.diamond(argument);
    });
  }

}
