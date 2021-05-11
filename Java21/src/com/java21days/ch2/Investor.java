package com.java21days.ch2;

public class Investor {
    public static void main(String[] args) {
        double initialValue = 14000;
        double yearOne, yearTwo, yearThree;
        System.out.println("Initial value: " + initialValue);
        
        yearOne = initialValue * 1.4;
        System.out.println("After 1 year: " + yearOne);
        
        yearTwo = yearOne - 1500;
        System.out.println("After 2 years: " + yearTwo);
        
        yearThree = yearTwo * 1.12;
        System.out.println("After 3 years: " + yearThree);
    }
}
