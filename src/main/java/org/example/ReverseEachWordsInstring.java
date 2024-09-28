package org.example;

public class ReverseEachWordsInstring {
    public static void main(String[] args){

        String original="Welcome to Java";
        String seperate[]=original.split(" ");
        String reversed = "";
        String reverse="";
        for(int i=0;i<seperate.length;i++){
            int lenth=seperate[i].length();
            for(int j=lenth-1;j>=0;j--) {

                reverse = reverse + seperate[i].charAt(j);

            }

            }
        System.out.println(reversed+reverse+" ");



    }
}
