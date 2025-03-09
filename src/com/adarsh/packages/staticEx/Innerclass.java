package com.adarsh.packages.staticEx;

// outside classes caonnot be satatic and inner can be
class Testout{
    static String name;
    public Testout(String name){
        Testout.name=name;
    }
}
public class Innerclass {
    static class Test{
        String name;

        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Adarsh");
        Test b = new Test("Singh");
        Testout x = new Testout("Adarsh");
        Testout y = new Testout("Singh");
        System.out.println(a.name + " " +b.name);
        System.out.println(x.name + " " +y.name);
    }
}
