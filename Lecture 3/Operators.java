package com.company;

class Main{
    public static void main(String[] args){
        //Java Unary Operator
        System.out.println("Java Unary Operator");
        int x=10, y=-10;
        boolean z=true;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10
        System.out.println(~x);//-11
        System.out.println(~y);//9
        System.out.println(!z);//false
        System.out.println(" ");

        //Java Arithmetic Operators
        System.out.println("Java Arithmetic Operators");
        int a=5;
        int b=2;
        System.out.println(a+b);//7
        System.out.println(a-b);//3
        System.out.println(a*b);//10
        System.out.println(a/b);//2
        System.out.println(a%b);//1

        //Shift Operators
        System.out.println("Shift Operators");
        System.out.println(10<<2);/*10 in binary is 1010 shift two decimal
        places to left it becomes 101000 that is 40*/
        System.out.println(10>>2);/*10 in binary is 1010 shift two decimal
        places to right it becomes 10 that is 2*/

        //Logical Operator
        int n = 1, m = 2, o = 9;
        boolean result;
        result = (n > m) || (o > n);
        System.out.println(result);
        result = (n > m) && (o > n);
        System.out.println(result);
    }

}
