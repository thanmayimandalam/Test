package com.company;

/**
 * Created by Thanmayi on 7/18/2017.
 */
 class A {

    // static String asdf = "thanu";

    public static void main(String thanu[]){


        welcomeMessage(userName("thanu"));

       // welcomeMessage(asdf);

        System.out.println("Area of a Rectangle is : "+RectangleArea(8,2));
    }

     static void welcomeMessage(String name){

         System.out.println("Welcome "+name+" to the Area and Perimeter Calculator");

     }

     static int RectangleArea(int x, int y){

         return x*y;
     }

     static String userName(String name){

         return name;
     }

}
