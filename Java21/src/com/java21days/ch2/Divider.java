package com.java21days.ch2;

public class Divider {
    public static void main(String[] args) {
        displayAndDivide(5,2);
    }
    
    public static void displayAndDivide(float x, float y) {
        System.out.println("Dividing " + x + " by " + y + " ...");
        System.out.println("Result: " + x/y + "\t Remainder: " + x%y);
    }
}
