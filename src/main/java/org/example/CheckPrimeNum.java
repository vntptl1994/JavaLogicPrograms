package org.example;

public class CheckPrimeNum {
    public static void main(String[] args){
        int num=3;
        int count=0;
        if(num>1) {
            for (int i = 0; i < num; i++) {
               if(i%2==0){
                   count++;
               }
            }
            if(count==2){
                System.out.println("number is prime");
            }
            else{
                System.out.println("number is not prime");
            }
        }
    }
}
