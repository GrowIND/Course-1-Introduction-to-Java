//GrowIND
//Introduction to Java
//Lecture 7: Arrays


package com.company;
import java.util.Arrays;

class Main {

    public static void main(String args[]){
        int intArr[] = { 10, 20, 15, 22, 35 };

        Arrays.sort(intArr);

        int Key = 22;

        System.out.println(Key+ " found at index = "+Arrays.binarySearch(intArr, Key));
    }
}
