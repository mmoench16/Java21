/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days.ch3;

import java.util.StringTokenizer;
/**
 *
 * @author mmoen
 */
public class Birthday {
    public static void main(String[] args) {
        printBirthday("04/29/2020");
    }
    
    public static void printBirthday(String birthday) {
        StringTokenizer st = new StringTokenizer(birthday, "/");
        System.out.println("Your birthday is on..");
        System.out.println("Month: " + st.nextToken());
        System.out.println("Day: " + st.nextToken());
        System.out.println("Year: " + st.nextToken());
    }
}
