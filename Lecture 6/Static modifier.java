//GrowIND
//Introduction to Java
//Lecture 6: Classes and Objects

package com.company;
public class Main {

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }


    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    
    public static void main(String[ ] args) {
        myStaticMethod();

        Main myObj = new Main();
        myObj.myPublicMethod();
    }
}



