//GrowIND
//Introduction to Java
//Lecture 1: Introduction to Object Oriented Programming

package com.company;

class Vehicle{
           int top_speed = 80, acc;
           char color;
        }
class Main{
    public static void main(String[] args){

        Vehicle Car = new Vehicle();
        System.out.println("Top speed can't exceed " +Car.top_speed);
    }
}
