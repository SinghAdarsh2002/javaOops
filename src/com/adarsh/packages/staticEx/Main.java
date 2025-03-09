package com.adarsh.packages.staticEx;

public class Main {
//    static means method run without creating object
//    i.e. why main is static ..... we can't create object of main as this the first line to be run
    public static void main(String[] args) {
        Human adarsh = new Human(22,"Adarsh", 00000, false);
        Human akash = new Human(20,"Akash", 00000, false);
        System.out.println(Human.population);
        System.out.println(Human.population);

//        greet();
//        can not call non static in static context but its vice versa is true
        fun();
        Main obj = new Main();
        obj.greet();
    }
//    this is dependent on objects
    void greet(){
        System.out.println("This is non static");
        fun2();
    }
    void fun2(){
        System.out.println("I am also non static");
    }
    static void fun(){
        System.out.println("non static can be called inside static context");
        System.out.println("I am static");
    }
}
