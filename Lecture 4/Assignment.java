//GrowIND
//Introduction to Java
//Lecture 4: Control Statement I: if-else
package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
            System.out.println("Players Enter Your Names");
            String nameA = new String();
            nameA=s.next();
            String nameB = new String();
            nameB=s.next();
            s.close();
            Random r=new Random();
            int A_number1= r.nextInt(1000);
            int B_number1= r.nextInt(1000);
            int A_number2= r.nextInt(1000);
            int B_number2= r.nextInt(1000);
            int A_number3= r.nextInt(1000);
            int B_number3= r.nextInt(1000);

            int A_final = A_number1 + A_number2 + A_number3;
            int B_final = B_number1 + B_number2 + B_number3;

            if (A_final>B_final) {
                System.out.print("The winner is " +nameA+ " with the score of " + A_final);
            }
        else {
                System.out.println("The winner is " +nameB+ " with the score of " + B_final);
            }
    }
}
