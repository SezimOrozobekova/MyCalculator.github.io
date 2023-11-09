package com.example.mycalculator;

public class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message){
        super(message);
    }
}
