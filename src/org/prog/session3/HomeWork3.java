package org.prog.session3;

import java.util.Random;

//TODO: write cycle which will fill another array in reverse.
// example: [10,14,18,20,1] -> [1,20,18,14,10]

public class HomeWork3 {


    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100);
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }

        System.out.println("---------------");

        int[] arr2 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr2[arr2.length - 1 - i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);

        }
    }
}
