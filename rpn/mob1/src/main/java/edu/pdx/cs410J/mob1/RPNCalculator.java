package edu.pdx.cs410J.mob1;

import com.google.common.annotations.VisibleForTesting;

import java.util.Stack;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RPNCalculator {

  private Stack<Integer> stack = new Stack<>();
  public RPNCalculator(String expression){
    String[] parsed = expression.split(" ");
    for (int i =0; i < parsed.length; i++) {
      String value = parsed[i];
      if(isOperation(value)) {
        Integer Operand1 = stack.pop();
        Integer Operand2 = stack.pop();
        switch (value) {
            case "+":
                stack.push(Operand1 + Operand2);
                break;
            case "-":
                stack.push(Operand2 - Operand1);
                break;
            case "*":
                stack.push(Operand2 * Operand1);
                break;
            case "/":
                stack.push(Operand2 / Operand1);
                break;
        }
      }
      else {
        Integer intvalue = Integer.parseInt(value);
        stack.push(intvalue);
      }

    }
  }
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  private boolean isOperation(String operator){
    return (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"));
  }

  private void operation(int Operand1, int Operand2, String Operation){
      switch (Operation) {
          case "+":
              stack.push(Operand1 + Operand2);
              break;
          case "-":
              stack.push(Operand2 - Operand1);
              break;
          case "*":
              stack.push(Operand2 * Operand1);
              break;
          case "/":
              stack.push(Operand2 / Operand1);
              break;
      }


  }

  public int result() {
    return stack.pop();
  }
}