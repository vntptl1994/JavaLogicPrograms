package org.example;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 6};
        int missingNum=0;
        int sum1=0;
        int bignum=0;
        int sum2=0;
        //sum elemnets in array
        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];
            bignum=a.length+1;

        }
        System.out.println(bignum);

        //sum of elements in series should be
        for(int i=1;i<=6;i++){
            sum2=sum2+i;

        }
        System.out.println(sum2);

        missingNum=sum2-sum1;
        System.out.println("Missing num in array is"+missingNum);
    }
}
