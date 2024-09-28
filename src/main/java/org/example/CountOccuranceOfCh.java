package org.example;

public class CountOccuranceOfCh {
    public static void main(String[] args){
        String s="Java Program";
        System.out.println("Before removing character a "+s.length() );

        int newlenth=s.replace("a","").length();
        System.out.println("After removing character a "+newlenth );
        System.out.println("Occurance of a: "+(s.length()-newlenth));
    }

}
