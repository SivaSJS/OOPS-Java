package com.company;

public class ClassB  extends ClassA{
    void myBio(String name){
        System.out.println("Hi i'am " + name + " and my age is " + myAge(22) );
        // myAge method from class A inherited
    }
}
