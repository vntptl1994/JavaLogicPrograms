package org.example;

public class SearchinganElementInArrayLinearSearch {
    public static void main(String[] args){
        //linear search
        boolean status=false;
        int a[]=new int[]{10,20,30,40};
        int expectedvalue=30;
        for(int i=0;i<a.length;i++){
            if(a[i]==expectedvalue){
                status=true;
                System.out.println("expected matched at index: "+a[i]);
                break;
            }
        }
        if(status==false){
            System.out.println("Expected not found");

        }
            }
}
