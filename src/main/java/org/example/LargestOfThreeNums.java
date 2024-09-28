package org.example;

public class LargestOfThreeNums {
    public static void main(String[] args){
        //approach 1
        /*int a=10,b=5,c=15;
       if(a>b && a>c){
           System.out.println("a is larger");
       }
       else if(b>c && b>a){
           System.out.println("b is larger");
       }
       else {
           System.out.println("c is larger");
       }*/
        //appraoch 2 -ternary operator
        int a=10,b=5,c=15;
        int largest=c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println(largest);
    }
}
