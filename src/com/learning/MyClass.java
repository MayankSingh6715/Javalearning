package com.learning;

public class MyClass extends PhoneBrand {
    MyClass(String brandName) {
        super(brandName);
    }

    public static void main(String[] args) {
        phone obj = new MyClass("Iphone");
        phone obj1 = new MyClass("Mi");
        phone obj2 = new MyClass("Samsung");

//      Interface Implementation
        obj.displayName();
        obj1.displayName();
        obj2.displayName();
        
//      inner class implementation
        InnerClass outter = new InnerClass();
        InnerClass.inner1 inner = outter.new inner1();
        inner.alert();
    }
}
