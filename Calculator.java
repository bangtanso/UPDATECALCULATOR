package com.example.javacalculator;

public class Calculator {
    private double operand1;
    private double operand2;
    private char operator;
    private double result;


    public void calculate() throws DivisionByZeroException {
        if (this.operator == '+') {
            this.result = this.operand1 + this.operand2;
        } else if (this.operator == '-') {
            this.result = this.operand1 - this.operand2;
        } else if (this.operator == '*') {
            this.result = this.operand1 * this.operand2;
        } else if (this.operator == '/') {
            // Check if operand2 is zero before performing division
            if (this.operand2 == 0) {
                throw new DivisionByZeroException("Division by zero is not allowed.");
            }
            this.result = this.operand1 / this.operand2;
        } else {
            // Print an error message for invalid operators
            System.out.println("Invalid operator");
        }
    }


    public double getOperand1(){
        return operand1;
    }
    public void setOperand1(double operand1){
        this.operand1 = operand1;
    }

    public double getOperand2(){
        return operand2;
    }
    public void setOperand2(double operand2){
        this.operand2 = operand2;
    }

    public char getOperator(){
        return operator;
    }
    public void setOperator(char operator){
        this.operator = operator;
    }

    public double getResult(){
        return result;
    }

    public void setResult(double result){
        this.result = result;
    }


}
