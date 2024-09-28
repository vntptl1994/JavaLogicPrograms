package org.example;

public class MaxMinInArray {
    public static void main(String[] args){
        int a[]=new int[]{2,4,5,6,7};
        //mininum from array
        int max=a[4];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
        //maximum from array
        int min=a[1];
        for(int j=1;j<a.length;j++){
            if(a[j]<min){
                min=a[j];
            }
        }
        System.out.println(min);
    }
}
