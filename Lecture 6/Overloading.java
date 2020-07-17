//GrowIND
//Introduction to Java
//Lecture 6: Classes and Objects

package com.company;
class Farm
{
    private double lenght ;
    private double width;

    Farm (double l, double w)
    {
        System.out.println("Constructor-1 Called");
        lenght = l;
        width = w;
    }
    Farm (double w)
    {
        System.out.println("Constructor-2 Called");
        lenght = 60.0;
        width = 20;
    }
    Farm ()
    {
        System.out.println("Constructor-3 called");
        lenght = 60;
        width = 20;
    }
    double area()
    {
        return lenght*width;
    }
}

public class Main{
    public static void main(String args[]) {
        Farm farm1 = new Farm(50, 20);
        Farm farm2 = new Farm(30);
        Farm farm3 = new Farm();
        double farmArea1, farmArea2,farmArea3;
        farmArea1 = farm1.area();
        farmArea2 = farm2.area();
        farmArea3 = farm3.area();

        System.out.println("Area of Farm1 = " +farmArea1);
        System.out.println("Area of Farm2 = " +farmArea2);
        System.out.println("Area of Farm3 = " +farmArea3);
    }

}
