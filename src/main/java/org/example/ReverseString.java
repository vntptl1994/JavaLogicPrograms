package org.example;


public class ReverseString {
    public static void main(String[] args){
        String original="Welcome";
        String reverse="";
        for(int i=original.length()-1;i>=0;i--){
            reverse=reverse + original.charAt(i);
        }
        System.out.println(reverse);

    }
}
