package org.example;

public class DuplicateElementInarray {
    Boolean duplicate=false;
    public static void main(String[] args){

        Boolean duplicate=false;

        String s[]=new String[]{"Java","Selemium","Android","Java"};
        for(int i=0;i<s.length;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i]==s[j]){
                    duplicate=true;
                    System.out.println(s[i]);

                }else{
                    duplicate=false;
                }

            }
            if(duplicate==true){
                System.out.println("Duplicate found");
            }
        }
    }
}
