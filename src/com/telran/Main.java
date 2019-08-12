package com.telran;

public class Main {

    public static void main(final String[] args) {
        try {
            new MyClass();
        } catch (ExceptionInInitializerError e) {
            System.out.println("ignore");
        }

        System.out.println(MyClass.CONSTANT);
        MyClass.print();
//        new MyClass();
    }
}

class MyClass {

    public static final String CONSTANT = "constant";

    public static void print() {
        System.out.println("print");
    }

    static {
    }

    public MyClass() {
        System.out.println("ctor");
    }
}


//class Person {
//    public final static String organization;
//    private String name;
//    private String position;
//
//    static {
//        //this.organization = "abc";
//    }
//
//    public Person (String name, String position) {
//        this.organization = "Tel-Ran";
//        //setOrganization("Tel-Ran");
//        this.name = name;
//        this.position = position;
//    }
//
////    public void setOrganization(String organization) {
////        this.organization = organization;
////    }
//}
