package com.test.TestProject;

public class SampleA {

    int a, b;

    public SampleA(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addTheNumbers(){
        System.out.println("Adding the numbers");
        return a+b;
    }
}