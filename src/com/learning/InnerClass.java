package com.learning;

public class InnerClass {
    private int data = 30;
    class inner1{
        void alert(){
            System.out.print("Max limit reached of login: "+ data);
        }
    }
}
