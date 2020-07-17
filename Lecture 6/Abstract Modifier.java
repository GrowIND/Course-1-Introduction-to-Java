//GrowIND
//Introduction to Java
//Lecture 6: Classes and Objects

package com.company;
abstract class Person {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); 
}


class Student extends Person {
    public int graduationYear = 2018;
    public void study() {
        System.out.println("Studying all day long");
    }
}
class Main {
    public static void main(String[] args) {

        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
    }
}


