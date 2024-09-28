package org.example;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {
    public static void main(String[] args){
        int a[]=new int[]{20,50,10};
        //approach 1
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //approach 2 -decending order
        Integer b[]=new Integer[]{20,40,80};
        Arrays.sort(b,Collections.reverseOrder());
        System.out.println("Descending order: "+Arrays.toString(b));

    }
}
