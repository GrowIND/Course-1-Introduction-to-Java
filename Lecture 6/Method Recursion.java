//GrowIND
//Introduction to Java
//Lecture 6: Classes and Objects


package com.company;

class Main {

    static int factorial( int n ) {
        if (n != 0)
            return n * factorial(n-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        int number = 4, result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}
