package edu.pdx.cs410J.mob1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MinesweeperTest
{
  @Test
  void input2x2stars() {
    int col = 2;
    int row = 2;

    Minesweeper minesweeper = new Minesweeper(row, col);
    assertThat(row, equalTo(minesweeper.row));
    assertThat(col, equalTo(minesweeper.col));
  }
}
