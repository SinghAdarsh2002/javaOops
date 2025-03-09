package com.adarsh.packages.staticEx;

public class Human {
    int age;
    String name;
    int sal;
    boolean isMarried;
//    static are not dependent on objects
    static int population;

    static void coolMsg(){
        System.out.println("hello this is static method and you can't use this keyword here becouse I'm not dependent on onjects");
//        this.name = name; it will give error
    }

    Human(int age, String name, int sal, boolean isMarried){
        this.age = age;
        this.name = name;
        this.sal = sal;
        this.isMarried = isMarried;
//        convetion is to put class name because it is common to all objets
        Human.population +=1;
    }

}
