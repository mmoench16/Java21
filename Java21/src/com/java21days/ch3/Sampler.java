/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days.ch3;

import com.java21days.ch3.Sample;
/**
 *
 * @author mmoen
 */
public class Sampler {
    public static void main(String[] args) {
        Sample samp = new Sample();
        samp.height = 30;
        samp.weight = 10;
        samp.depth = 5;
        System.out.println("Height: " + samp.height);
        System.out.println("Weight: " + samp.weight);
        System.out.println("Depth: " + samp.depth);
    }
}
