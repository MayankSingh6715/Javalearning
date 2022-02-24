package com.learning;

public class MyClass extends PhoneBrand {
    MyClass(String brandName) {
        super(brandName);
    }

    public static void main(String[] args) {
        phone obj = new MyClass("Iphone");
        phone obj1 = new MyClass("Mi");
        phone obj2 = new MyClass("Samsung");

        obj.displayName();
        obj1.displayName();
        obj2.displayName();
    }
}
