package org.example;

public class EvenOddNumFromArray {
    public static void main(String[] args){
        int a[]=new int[]{2,4,5,6,7};
        String evennum = "";
        String odd="";
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println("Even nums are: "+a[i]);
            }
            else
            {
                System.out.println("odd nums are: "+a[i]);
            }
        }
        System.out.println(evennum);
        System.out.println(odd);
    }
}
