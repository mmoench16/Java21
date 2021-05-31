package com.java21days.ch8;

import java.util.*;

public class ComicBooks3 {

    public ComicBooks3() {}
    
    public static void main(String[] args) {
        HashMap quality = new HashMap();
        quality.put(Condition.PRISTINE_MINT, 5.0F);
        quality.put(Condition.MINT, 3.0F);
        quality.put(Condition.NEAR_MINT, 2.0F);
        quality.put(Condition.VERY_FINE, 1.5F);
        quality.put(Condition.FINE, 1.0F);
        quality.put(Condition.GOOD, 0.5F);
        quality.put(Condition.POOR, 0.25F);
        quality.put(Condition.COVERLESS, 0.1F);
        
        // set up collection
        Comic3[] comics = new Comic3[5];
        comics[0] = new Comic3("Amazing Spider-Man", "1A", Condition.VERY_FINE, 12_000.00F);
        comics[0].setPrice((Float) quality.get(comics[0].condition));
        comics[1] = new Comic3("Incredible Hulk", "181", Condition.NEAR_MINT, 680.00F);
        comics[1].setPrice((Float) quality.get(comics[1].condition));
        comics[2] = new Comic3("Cerebus", "1A", Condition.MINT, 190.00F);
        comics[2].setPrice((Float) quality.get(comics[2].condition));
        comics[3] = new Comic3("Marvel", "1A", Condition.PRISTINE_MINT, 200.00F);
        comics[3].setPrice((Float) quality.get(comics[3].condition));
        comics[4] = new Comic3("X-Men", "2A", Condition.COVERLESS, 300.00F);
        comics[4].setPrice((Float) quality.get(comics[4].condition));
        
        for (int i = 0; i < comics.length; i++) {
            System.out.println("Title: " + comics[i].title);
            System.out.println("Issue: " + comics[i].issueNumber);
            System.out.println("Condition: " + comics[i].condition);
            System.out.println("Price: $" + comics[i].price + "\n");
        }
    }
}

class Comic3 {
    String title;
    String issueNumber;
    Condition condition;
    float basePrice;
    float price;
    
    Comic3(String inTitle, String inIssueNumber, Condition inCondition, float inBasePrice) {
        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }
    
    void setPrice(float factor) {
        price = basePrice * factor;
    }
}

enum Condition {
    PRISTINE_MINT,
    MINT,
    NEAR_MINT,
    VERY_FINE,
    FINE,
    GOOD,
    POOR,
    COVERLESS
}
