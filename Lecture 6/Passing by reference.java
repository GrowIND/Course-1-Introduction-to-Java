//GrowIND
//Introduction to Java
//Lecture 6: Classes and Objects


package com.company;

class Ref{
    int n;
    Ref(int x){
        n=x;
    }

    int func(Ref Obt){
        Obt.n += 4;
        return Obt.n;
    }
}
class Main{
    public static void main (String args[]){
        Ref refObj1 = new Ref(10);

        System.out.println("Value returned by function =" + refObj1.func(refObj1));
        System.out.println("Value returned by function =" + refObj1.func(refObj1));
        Ref refObj2 = new Ref(20);
        System.out.println("Value returned by function =" + refObj2.func(refObj2));
        System.out.println("Value returned by function =" + refObj2.func(refObj2));
    }
}
