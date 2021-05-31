package com.java21days.ch8;

import java.util.*;

public class ComicBooks {
    public ComicBooks() {
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
        
        // set up collection
        Comic[] comics = new Comic[3];
        comics[0] = new Comic("Amazing Spider-Man", "1A", "very fine", 12_000.00F);
        comics[0].setPrice((Float) quality.get(comics[0].condition));
        comics[1] = new Comic("Incredible Hulk", "181", "near mint", 680.00F);
        comics[1].setPrice((Float) quality.get(comics[1].condition));
        comics[2] = new Comic("Cerebus", "1A", "good", 190.00F);
        comics[2].setPrice((Float) quality.get(comics[2].condition));
        
        for (int i = 0; i < comics.length; i++) {
            System.out.println("Title: " + comics[i].title);
            System.out.println("Issue: " + comics[i].issueNumber);
            System.out.println("Condition: " + comics[i].condition);
            System.out.println("Price: $" + comics[i].price + "\n");
        }
    }
}

class Comic {
    String title;
    String issueNumber;
    String condition;
    float basePrice;
    float price;
    
    Comic(String inTitle, String inIssueNumber, String inCondition, float inBasePrice) {
        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }
    
    void setPrice(float factor) {
        price = basePrice * factor;
    }
}
