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
        if(n%2==0)
            System.out.println("The Number "+n+" is even");
        else
            System.out.println("The Number "+n+" is odd");
    }
}
