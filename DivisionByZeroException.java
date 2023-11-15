package com.example.javacalculator;

public class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String s){
        super("Division By Zero Exception");
    }
}
