package edu.pdx.cs410J.mob;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class TennisTest
{

  @Test
  void canInstantiateKataClass() {
    new Tennis();
  }

  @Test
  void playerHasInitialScoreOfLove() {
    Player player = new Player();
    assertThat(player.getScore(), equalTo(0));
  }

}
