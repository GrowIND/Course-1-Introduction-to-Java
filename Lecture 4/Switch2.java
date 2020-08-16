//GrowIND
//Introduction to Java
//Lecture 4: Control Statement I: if-else
package com.company;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name");
        String name= new String();
        name = s.next();
        switch (name){
            case "Amit":
                System.out.println(name + " lives in Haridwar");
                break;
            case "Akash":
                System.out.println(name + " lives in Kanpur");
                break;
            case "Prachi":
                System.out.println(name + " lives in Dehradun");
                break;
            case "Sarthak":
                System.out.println(name + " lives in Meerut");
                break;
            default:
                System.out.println("Name not in database");
        }
    }
}
