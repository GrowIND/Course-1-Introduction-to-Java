//GrowIND
//Introduction to Java
//Lecture 6: Classes and Objects

package com.company;
import java.util.Scanner;

class Calculator
{
    public int Add(int num1, int num2)
    {
        System.out.println("Calculator Class Started");
        return num1 + num2;
    }
}


class PrintData
{
    public void print(int value)
    {
        System.out.println("PrintData Class Started");
        System.out.println(value);
    }
}

public class Main
{
    public static void main(String args[]) {
        int result;
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        Calculator calc=new Calculator();

        result=calc.Add(a,b);


        PrintData pdata=new PrintData();

        pdata.print(result);

    }
}
