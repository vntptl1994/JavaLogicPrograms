package org.example;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        //first logic
        /*int a=10;
        int b=20;
        int temp=0;
        System.out.println("Swap two numbers");
        temp=a;
        a=b;
        b=temp;
        System.out.println("a is " +a);
        System.out.println("b is " +b);*/

        //without temp variable
        int a=10;
        int b=20;
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("a is " +a);
        System.out.println("b is " +b);



    }
}