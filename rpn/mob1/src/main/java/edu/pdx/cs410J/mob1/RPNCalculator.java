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
      if(value.equals("SQRT")) {
          Integer Operand1 = stack.pop();
          operation(Operand1, 0, value);
      }
      else if(value.equals("MAX")) {
          Integer max = 0;
          while(!stack.empty()) {
              Integer val = stack.pop();
              if(val>max) {
                  max = val;
              }
          }
          stack.push(max);
      }
      else if(isOperation(value)) {
        Integer Operand1 = stack.pop();
        Integer Operand2 = stack.pop();
        operation(Operand1, Operand2, value);
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

    return (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("SQRT"));
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
          case "SQRT":
              stack.push((int) Math.sqrt(Operand1));
              break;
      }

  }

  public int result() {
    return stack.pop();
  }
}