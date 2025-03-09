package com.adarsh.packages.staticEx;

//initialisation 
public class StaticInt {
    static int a=4;
    static int b;
//    will only run once when the class is loaded
    static {
        System.out.println("I am static block");
        b = a*4;
    }

    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a+" "+StaticInt.b);
        StaticInt.b += 3;
        System.out.println(StaticInt.b);
        StaticInt obj2 = new StaticInt();
        System.out.println(StaticInt.a +" "+StaticInt.b);
    }
}
