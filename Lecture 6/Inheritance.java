package com.company;
class Add
{
    public int add(int i,int j)
    {
        return i+j;
    }
}


class Sub extends Add
{

    public int sub(int i,int j)
    {
        return i-j;
    }
}

class Multiply extends Sub
{
    public int multiply(int i,int j)
    {
        return i*j;
    }
}

public class Main {
    public static void main(String[] args) {
        Multiply c1 = new Multiply();
        int r1 = c1.add(5, 4);
        int r2 = c1.sub(6, 3);
        int r3 = c1.multiply(2, 3);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
