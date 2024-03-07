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

  private Stack<Double> stack = new Stack<>();
  public RPNCalculator(String expression){
      String[] parsed = expression.split(" ");
      for (String value : parsed) {
          if (value.equals("SQRT")) {
              Double Operand1 = stack.pop();
              operation(Operand1, 0, value);
          } else if (value.equals("MAX")) {
              if (stack.empty()) {
                  throw new IllegalArgumentException("Missing Operands for max.");
              }
              Double max = stack.pop();
              while (!stack.empty()) {
                  Double val = stack.pop();
                  if (val > max) {
                      max = val;
                  }
              }
              stack.push(max);
          } else if (isOperation(value)) {
              Double Operand1 = stack.pop();
              Double Operand2 = stack.pop();
              operation(Operand1, Operand2, value);
          } else {
              Double intvalue = Double.parseDouble(value);
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

  private void operation(double Operand1, double Operand2, String Operation){
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
              stack.push(Math.sqrt(Operand1));
              break;
      }

  }

  public double result() {
    return stack.pop();
  }
}