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
    assertThat(row, equalTo(minesweeper.rows));
    assertThat(col, equalTo(minesweeper.columns));
    minesweeper.addRow("**");
    minesweeper.addRow("**");
    minesweeper.solve();
    assertThat(minesweeper.getRow(0), equalTo("**"));
    assertThat(minesweeper.getRow(1), equalTo("**"));
  }

  @Test
  void input3x3dots() {
    int col = 3;
    int row = 3;

    Minesweeper minesweeper = new Minesweeper(row, col);
    assertThat(row, equalTo(minesweeper.rows));
    assertThat(col, equalTo(minesweeper.columns));
    minesweeper.addRow("...");
    minesweeper.addRow("...");
    minesweeper.addRow("...");
    minesweeper.solve();
    assertThat(minesweeper.getRow(0), equalTo("000"));
    assertThat(minesweeper.getRow(1), equalTo("000"));
    assertThat(minesweeper.getRow(2), equalTo("000"));
  }

}
