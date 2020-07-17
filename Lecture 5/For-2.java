//GrowIND
//Introduction to Java
//Lecture 5: Control Statement II: Loops

package com.company;

public class Main {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 1000; ++i) {
            sum += i;     // sum = sum + i
        }

        System.out.println("Sum = " + sum);
    }
}
