package org.example;

import java.util.Random;

public class RandomNumGenerate {
    public static void main(String[] args){
        //approach-1 (random class)
        Random random=new Random();
        System.out.println(random.nextDouble(5.0));

        //appraoch 2 -Math.Random
        int num= (int) Math.random();
        System.out.println(num);
    }
}
