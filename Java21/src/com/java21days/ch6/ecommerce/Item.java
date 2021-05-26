package com.java21days.ch6.ecommerce;

public class Item implements Comparable {
    private final String id;
    private final String name;
    private final double retail;
    private final int quantity;
    private double price;
    
    Item(String idIn, String nameIn, String retailIn, String qIn) {
        id = idIn;
        name = nameIn;
        retail = Double.parseDouble(retailIn);
        quantity = Integer.parseInt(qIn);
        
        if (quantity > 400) {
            price = retail * 0.5D;
        } else if (quantity > 200) {
            price = retail * 0.6D;
        } else {
            price = retail * 0.7D;
        }
        
        price = Math.floor(price * 100 + 0.5) / 100;
    }

    @Override
    public int compareTo(Object obj) {
         Item temp = (Item) obj;
         if (this.price < temp.price) {
            return 1;
        } else if (this.price > temp.price) {
            return -1;
        }
         return 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRetail() {
        return retail;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    
    
    
    
}
