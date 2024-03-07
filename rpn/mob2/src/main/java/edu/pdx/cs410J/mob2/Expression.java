package edu.pdx.cs410J.mob2;

import java.util.Stack;

public class Expression {
    public String[] stringParser(String rpn) {
        return rpn.split(" ");
    }

    private Stack<Integer> stack;

    public boolean isDigit(String string) {
        try {
            int num = Integer.parseInt(string);
            this.stack.push(num);
        } catch (Error e) {
            return false;
        }
        return true;
    }

//    public float iterateOverString(String string) {
//
//    }

    public int calculate(int operandOne, int operandTwo, String operator){
        if(operator.equals("+")) return operandOne + operandTwo;
        if(operator.equals("-")) return operandOne - operandTwo;
        if(operator.equals("/")) return operandOne / operandTwo;
        if(operator.equals("*")) return operandOne * operandTwo;

        return 0;

    }
}
