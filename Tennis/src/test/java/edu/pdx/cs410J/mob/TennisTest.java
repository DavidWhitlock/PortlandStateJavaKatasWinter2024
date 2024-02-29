package edu.pdx.cs410J.mob;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TennisTest
{

  @Test
  void canInstantiateKataClass() {
    new Tennis();
  }

  @Test
  void playerHasInitialScoreOfLove() {
    Player player = new Player();
    assertThat(player.getScore(), equalTo(player.CONSTANT_LOVE));
  }

  @Test
  void whenplayer1withScore0WinsPointScoreIs15() {
    Player player = new Player();
    player.winsAPoint();

    assertThat(player.getScore(), equalTo(15));

  }

  @Test
  void whenPLayerHas15pointsWinsAPointScoreis30(){
    Player player = new Player(15);
    player.winsAPoint();

    assertThat(player.getScore(), equalTo(30));

  }

  @Test
  void whenPLayerHas30pointsWinsAPointScoreis40(){
    Player player = new Player(30);
    player.winsAPoint();

    assertThat(player.getScore(), equalTo(40));

  }

  @Test
  void unrecognizedScoreThrowsIllegalArgumentException() {
    assertThrows(IllegalArgumentException.class, () -> { new Player(12); } );
  }

  @Test
  void whenPlayerWhoHas40WinsAPointAnExceptionIsThrown() {
    Player player = new Player(40);
//    assertThrows();
  }

}
