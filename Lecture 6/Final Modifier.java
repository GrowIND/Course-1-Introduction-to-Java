//GrowIND
//Introduction to Java
//Lecture 6: Classes and Objects

package com.company;

public class Main {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.x = 50; // will generate an error: cannot assign a value to a final variable
        myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
    }
}
