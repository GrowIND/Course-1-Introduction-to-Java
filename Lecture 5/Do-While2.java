//GrowIND
//Introduction to Java
//Lecture 5: Control Statement II: Loops

package com.company;


import java.util.Random;

class Main {
    public static void main(String[] args) {
        int a;
        Random r = new Random();

        do {
            a=r.nextInt(100);
            System.out.println(a);
        }
        while(a>10);

    }
}
