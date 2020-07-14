//GrowIND
//Introduction to Java
//Lecture 2: Program Structure in Java
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter area of rectangle");
      int a = scan.nextInt();
      int b = scan.nextInt();
      int area = a*b;
      int paint=area*2;
      System.out.println("Paint required will be " +paint+ "ml" );
    }
}
