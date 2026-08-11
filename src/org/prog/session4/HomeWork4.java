package org.prog.session4;

//TODO: Bubble sort array of random ints (see SortingDemo)
// RU: Сортировка пузырьком
// TIP: while + for

import java.util.Random;

public class HomeWork4 {


    public static void main(String[] args) {
        Random random = new Random();
//        int EX = int i;
        int[] arr1 = new int[5];


        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100);
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }
        System.out.println("==================");

        while (true){
            for (int i = 0; i < arr1.length; i++) {   ///  25 56 70 50
                if (arr1[i] > arr1[i+1]){
                    int EX = arr1[i];
                    int NEXT = arr1[i+1];
                    arr1[i+1] = EX;
                    arr1[i] = NEXT;
                }
                System.out.println("arr1[" + i + "] = " + arr1[i]);

            }

        }

    }
}

