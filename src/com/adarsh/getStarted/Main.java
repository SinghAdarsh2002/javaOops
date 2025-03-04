package com.adarsh.getStarted;

/*
import java.util.*;
*/

public class Main {
    public static void main(String[] args) {
//        data of five students having {name, roll_no, marks}
//        String[] name = new String[5];
//        int[] role_no = new int[5];
//        float[] marks = new float[5];
//      combine them into a single entity...how ? ->> by using class
//      class is named group of properties and function

//        Student[] students = new Student[5];
//        System.out.println(Arrays.toString(students));

//        Student raghu = new Student();
//  seperately define the values
//        raghu.marks = 91f;
//        raghu.role_no = 10;
//        raghu.name = "Raghav";

//        initialise by using constructor---
        Student raghu = new Student("Rahgav",10,91f);

        System.out.println(raghu.role_no);
        System.out.println(raghu.marks);
        System.out.println(raghu.name);

        Student random = new Student(raghu);
        System.out.println(random.name);
        Student s1 = new Student();
    }
//    creat class >>> it is a template
}
class Student{
    String name;
    int role_no;
    float marks;

    Student(){
//        call a constructor from cunstroctor
        this("xyz",13,109.0f);
    }
    Student(Student other){
        this.name = other.name;
        this.role_no = other.role_no;
        this.marks = other.marks;
    }
    Student(String name, int role_no, float marks){
//        here it will not assign the we passed in the argument
//        to assign values we can change the rhs variables
//        or we can use this. keyworrd it is best way
        this.name = name;
        this.role_no = role_no;
        this.marks = marks;
    }
}