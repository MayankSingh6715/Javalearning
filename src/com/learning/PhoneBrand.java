package com.learning;

public class PhoneBrand implements phone {
    String brandName;
    PhoneBrand(String brandName){
        this.brandName = brandName;
    }

    @Override
    public void displayName() {
        System.out.println(this.brandName);
    }
}
