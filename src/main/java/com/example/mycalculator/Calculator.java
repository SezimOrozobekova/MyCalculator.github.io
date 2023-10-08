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


//        switch (operator){
//            case '+':
//                this.result = operand1 + operand2;
//                break;
//            case '-':
//                this.result = operand1 - operand2;
//                break;
//            case '/':
//                if (operand2 != 0){
//                    this.result = operand1/ operand2;
//                    break;
//                } else{
//                    System.out.println("Can't divide by 0");
//                    break;
//                }
//
//            case '*':
//                  this.result =  operand1 * operand2;
//                  break;
//            case '=':
//                  break;
//        }
        public void calculate(){
            if(this.operator == '+') {
                this.result = this.operand1 + this.operand2;
            }
        }


    public double getResult(){
        return result;
    }


}
