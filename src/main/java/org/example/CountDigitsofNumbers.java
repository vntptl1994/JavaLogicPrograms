package org.example;

import java.util.Scanner;

public class CountDigitsofNumbers {
    public static void main(String[] args){
        int count=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        while (num!=0){
            num=num/10;
            count=count+1;
        }
        System.out.println(count);

    }
}
