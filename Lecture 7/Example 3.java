//GrowIND
//Introduction to Java
//Lecture 7: Arrays


package com.company;
import java.util.Scanner;

class Main {

    public static void main(String args[]){
        int arr[][] = new int[4][2];
        Scanner s=new Scanner(System.in);

        for(int i=0 ; i<4;i++){
            for(int j =0 ; j<2; j++) {
                arr[i][j] = s.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
         }
    }}
