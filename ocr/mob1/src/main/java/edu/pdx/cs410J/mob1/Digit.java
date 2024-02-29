package edu.pdx.cs410J.mob1;

import java.util.Arrays;

public class Digit {

    static String[] one = {"   ", "  |", "  |"};
    private int number;
    public Digit(String[] arrayNum){
        number = parseDigit(arrayNum);
    }
    public int getNum() {
        return number;
    }

    public int parseDigit(String[] array) {
        if (Arrays.equals(array, one)) {
            return 1;
        }
        return 0;
    }
}
