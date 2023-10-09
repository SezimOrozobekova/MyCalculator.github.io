package com.example.mycalculator;

public class Calculator {
    private double operand1;
    private double operand2;
    private char operator;
    private double result;

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }




        public void calculate(){
            if(this.operator == '+') {
                this.result = this.operand1 + this.operand2;
            }
            if(this.operator == '-') {
                this.result = this.operand1 - this.operand2;
            }
            if(this.operator == '*') {
                this.result = this.operand1 * this.operand2;
            }
            if(this.operator == '/') {
                if(operand2 != 0){
                    this.result = this.operand1 / this.operand2;
                } else {

                }

            }
        }


    public double getResult(){
        return result;
    }


}
