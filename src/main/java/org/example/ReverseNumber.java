package org.example;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        //using algorithm
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        System.out.println(num);
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);*/
        //using Stringbuffer class
        int num=1234;
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();
        System.out.println("Reverse number is "+rev);

    }


}
