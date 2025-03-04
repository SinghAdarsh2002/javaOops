package com.adarsh.getStarted;

public class WrapperExamples {
    public static void main(String[] args) {
        int a = 10;
        Integer num = 20;
        int b = 30;
        swap(a,b);
        System.out.println(a + " " +b); //it is not swaped;
//        Integer x = 10; //object
//        Integer y = 30; //object
//        swap(a,b);
//        System.out.println(x+" "+b); //still not swaped
//        this can be swaped by final keyword
//        always initialize final var while declaring
//        it garantees imutability for primitive datatype and when it is object it can not reassigned
        final int q = 10;
        final Integer s = 10;

//        final A number = new A(8);
//        number.x = 20;
//        System.out.println(number.x);
        A obj = new A(30);
        for (int i=0; i<100; i++){
            obj = new A(10);
        }
    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static class A{
        int x;
        A(int x){
            this.x = x;
            System.out.println("Obj is created");
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }
    }
}
