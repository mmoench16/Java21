package com.java21days.ch8;

import java.util.*;

public class ComicBooks2 {
    public ComicBooks2() {
    }
    
    public static void main(String[] arguments) {
        // set up hash map
        HashMap quality = new HashMap();
        float price1 = 3.00F;
        quality.put("mint", price1);
        float price2 = 2.00F;
        quality.put("near mint", price2);
        float price3 = 1.50F;
        quality.put("very fine", price3);
        float price4 = 1.00F;
        quality.put("fine", price4);
        float price5 = 0.50F;
        quality.put("good", price5);
        float price6 = 0.25F;
        quality.put("poor", price6);
        // Additions
        float price7 = 5.00F;
        quality.put("pristine mint", price7);
        float price8 = 0.1F;
        quality.put("coverless", price8);
        
        // set up collection
        Comic2[] comics = new Comic2[5];
        comics[0] = new Comic2("Amazing Spider-Man", "1A", "very fine", 12_000.00F);
        comics[0].setPrice((Float) quality.get(comics[0].condition));
        comics[1] = new Comic2("Incredible Hulk", "181", "near mint", 680.00F);
        comics[1].setPrice((Float) quality.get(comics[1].condition));
        comics[2] = new Comic2("Cerebus", "1A", "good", 190.00F);
        comics[2].setPrice((Float) quality.get(comics[2].condition));
        comics[3] = new Comic2("Marvel", "1A", "pristine mint", 200.00F);
        comics[3].setPrice((Float) quality.get(comics[3].condition));
        comics[4] = new Comic2("X-Men", "2A", "coverless", 300.00F);
        comics[4].setPrice((Float) quality.get(comics[4].condition));
        
        for (int i = 0; i < comics.length; i++) {
            System.out.println("Title: " + comics[i].title);
            System.out.println("Issue: " + comics[i].issueNumber);
            System.out.println("Condition: " + comics[i].condition);
            System.out.println("Price: $" + comics[i].price + "\n");
        }
    }
}

class Comic2 {
    String title;
    String issueNumber;
    String condition;
    float basePrice;
    float price;
    
    Comic2(String inTitle, String inIssueNumber, String inCondition, float inBasePrice) {
        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }
    
    void setPrice(float factor) {
        price = basePrice * factor;
    }
}

