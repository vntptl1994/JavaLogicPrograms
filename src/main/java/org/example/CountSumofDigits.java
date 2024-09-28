package org.example;

import java.util.Scanner;

public class CountSumofDigits {
    public static void main(String[] args){
        int sum=0,digit=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num: ");
        int num=sc.nextInt();
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println("Total of digits is: "+sum);
    }
}
