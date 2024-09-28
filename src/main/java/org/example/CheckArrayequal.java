package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckArrayequal {
    public static void main(String[] args){
        Boolean status = true;
        int a1[]=new int[]{12,13,14,15};
        int a2[]=new int[]{12,13,14,15};
        //approach 1 to check equality of array
       /* status= Arrays.equals(a1,a2);
        if(status){
            System.out.println("two arrays are equal");
        }else{
            System.out.println("two arrays are not equal");
        }*/

        //approach 2
        if(a1.length==a2.length){
            for(int i=0;i<a1.length;i++){
                if(a1[i]!=a2[i]){
                    status=false;
                }
            }
        }else{
            status=false;
        }
        if(status){
         System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }

    }
}
