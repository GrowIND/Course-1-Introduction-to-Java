//GrowIND
//Introduction to Java
//Lecture 2: Program Structure in Java
package com.company;
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
            System.out.println("Enter the Names");
            String name = new String();
            name=s.next();
            s.close();
            System.out.println("Hi " +name+ " we have looked into your requirements, some from the team will contact you within 24 hrs with the prototype.\nThank you.");

    }
}

