package com.java21days.ch5;

import java.awt.Point;

class FourDPoint extends Point {
    int z, w;
    
    FourDPoint(int a, int b, int c, int d) {
        super(a, b);
        this.z = c;
        this.w = d;
    }
    
    public static void main(String[] args) {
        FourDPoint fdp = new FourDPoint(5, 5, 6, 6);
        System.out.println("x is " + fdp.x);
        System.out.println("y is " + fdp.y);
        System.out.println("z is " + fdp.z);
        System.out.println("w is " + fdp.w);
    }
}
