package org.example;

public class FibonacciSeries {
    public static void main(String[] args){

        int num1=0,num2=1, sum=0;
        for(int num=1;num<=10;num++){
            sum=num1+num2;//1+0=1//1+1=2//
            System.out.println(sum);
            num1=num2;//1
            num2=sum;//1
            num++;//2
        }
    }
}
