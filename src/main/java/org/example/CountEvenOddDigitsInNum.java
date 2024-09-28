package org.example;

public class CountEvenOddDigitsInNum {
    public static void main(String [] args){
        int num=24358;
        int digit=0;
        int oddnum=0,evennum=0;
        while (num>0){
            digit=num%10;
            num=num/10;
            if(digit%2==0){
                evennum++;
            }else{
                oddnum++;
            }
        }
        System.out.println("Odd numbers are: "+oddnum);
        System.out.println("even numbers are: "+evennum);
    }
}
