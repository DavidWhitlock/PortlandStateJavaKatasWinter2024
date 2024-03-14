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
  private int[][] numberOfBombs;
  private int currentRow;

  public Minesweeper(int rows, int columns) {
    this.rows = rows;
    this.columns = columns;
    this.currentRow = 0;
    this.numberOfBombs = new int[rows][columns];
    this.board = new char[rows][columns];
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public void addRow(String row) {
    this.board[currentRow] = row.toCharArray();
    currentRow++;
  }

  public void solve() {
    for (int i = 0; i < rows; ++i) {
      for (int j = 0; j < columns; ++j) {
        if (board[i][j] == '*') {
          incrementNumberofBombs(i -1, j-1);
          incrementNumberofBombs(i-1,j);
          incrementNumberofBombs(i-1, j+1);
          incrementNumberofBombs(i, j-1);
          incrementNumberofBombs(i, j+1);
          incrementNumberofBombs(i+1, j-1);
          incrementNumberofBombs(i+1, j);
          incrementNumberofBombs(i+1, j+1);
        }
      }
    }

  }

  private void incrementNumberofBombs(int i, int j) {
    if(i >= 0 && j >= 0 && i< rows && j < columns) {
      numberOfBombs[i][j]++;
    }
  }

  public String getRow(int row) {
    char[] boardRow = this.board[row];
    int[] numberOfBombsRows = this.numberOfBombs[row];

    StringBuilder outputRow = new StringBuilder();

    for (int i = 0; i < boardRow.length; i++) {
      if (boardRow[i] == '*') {
        outputRow.append('*');

      } else {
        outputRow.append(numberOfBombsRows[i]);
      }
    }

    return outputRow.toString();
  }
}