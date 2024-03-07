package edu.pdx.cs410J.mob2;

public class Expression {
    public String[] stringParser(String rpn) {
        return rpn.split(" ");
    }

    public int calculate(int operandOne, int operandTwo, String operator){
        if(operator.equals("+")) return operandOne + operandTwo;
        if(operator.equals("-")) return operandOne - operandTwo;
        if(operator.equals("/")) return operandOne / operandTwo;
        if(operator.equals("*")) return operandOne * operandTwo;

        return 0;

    }
}
