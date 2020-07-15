//GrowIND
//Introduction to Java
//Lecture 4: Control Statement I: if-else
package com.company;
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int n=s.nextInt();
        String str=new String();
       str = n%2==0 ? "even":"odd";
        System.out.println("The Number "+n+" is "+str);
    }
}
