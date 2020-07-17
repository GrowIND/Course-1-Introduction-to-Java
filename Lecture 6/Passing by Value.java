//GrowIND
//Introduction to Java
//Lecture 6: Classes and Objects


package com.company;
class PassValue {
    int func(int m, int n) {     //defining method
        m += 4;
        n -= 2;
        return m+n;

    }
}
public class Main {

    public static void main(String[] args) {
        int i=2, j=8;
        PassValue obj1 = new PassValue();
        PassValue obj2 = new PassValue();
        System.out.println("Func output = " + obj1.func(i,j));
        System.out.println("i = " + i + ", j ="+ j);
        System.out.println("Func output = " + obj2.func(i,j));
        System.out.println("i = " + i + ", j ="+ j);

    }
}
