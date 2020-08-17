//GrowIND
//Introduction to Java
//Lecture 7: Arrays


package com.company;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String args[]){
        int Arr[] = { 10, 20, 15, 45, 35 };
        int Arr2[] = {0,1,2,3,4};

        Arrays.sort(Arr);
        for(int i=0; i<Arr.length; i++)
        System.out.println(Arr[i]);

        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        System.out.println("Enter the number you want to search");
        System.out.println(k+ " found at index = "+Arrays.binarySearch(Arr, k));

        System.out.println(Arrays.equals(Arr,Arr2));

    }
}
