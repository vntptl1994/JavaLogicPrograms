package org.example;

public class SumOfArrayElements {
    public static void main(String[] args){
        int a[] =new int[]{1,2,4,5};
        int sum=0;
        for(int num:a){
            sum=sum+num;
        }
        System.out.println(sum);
    }

}
