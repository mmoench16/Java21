package com.java21days.ch6;

public class ZipCode {
    private String zipCode;
    
    ZipCode(String zip) {
        if (zip.length() == 5) {
            zipCode = zip;
            System.out.println("Zipcode correct.");
        } else {
            zipCode = "";
            System.out.println("Zipcode not correct.");
        }
    }

    public String getZipCode() {
        
        if (zipCode.length() == 5) {
            return zipCode;
        } else {
            return "ZipCode not set.";
        }
    }

    public void setZipCode(String zipCode) {
        
        if (zipCode.length() == 5) {
            this.zipCode = zipCode;
            System.out.println("Zipcode correct.");
        } else {
            this.zipCode = "";
            System.out.println("Zipcode not correct.");
        }
    }
    
    public static void main(String[] args) {
        ZipCode zip1 = new ZipCode("12345");
        ZipCode zip2 = new ZipCode("123456");
        System.out.println("Zip1: " + zip1.getZipCode());
        System.out.println("Zip2: " + zip2.getZipCode()); 
    }
    
}
