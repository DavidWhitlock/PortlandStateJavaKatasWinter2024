package edu.pdx.cs410J.mob1;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {
  int rows;
  int columns;

  private char[][] board;
  private int currentRow;

  public Minesweeper(int rows, int columns) {
    this.rows = rows;
    this.columns = columns;

    this.board = new char[rows][columns];
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public void addRow(String row) {
    currentRow = 0;
    this.board[currentRow] = row.toCharArray();
    currentRow++;
  }

  public void solve() {

  }

  public String getRow(int row) {
    return new String(this.board[row]);
  }
}