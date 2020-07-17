//GrowIND
//Introduction to Java
//Lecture 5: Control Statement II: Loops

package com.company;

import java.util.*;
public class Main
{
    public static void main(String args[]) {
        double sum = 0, term;
        int j = 0;
        for (; ; ){
            term = Math.pow(-1, j) / (1 + 2 * j);
        if (Math.abs(term) <= .00000025)
            break;
        sum += term;
        j++;
    }
    double PI = 4*sum;
        System.out.println("sum = " +sum+ " " + "PI = "+PI );

    }
}
