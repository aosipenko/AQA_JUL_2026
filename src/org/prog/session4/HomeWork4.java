package org.prog.session4;

//TODO: Bubble sort array of random ints (see SortingDemo)
// RU: Сортировка пузырьком
// TIP: while + for

import java.util.Random;

public class HomeWork4 {


    public static void main(String[] args) {

        boolean cycle = true;
        int[] numbers = new int[5];
        for (int i = 4; i > -1; i--) {
            numbers[i] = numbers.length - i;
            System.out.println("numbers " + i + " = " + numbers[i]);
        }
        System.out.println("==================");

        while (cycle) {
            cycle = false;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int EX = numbers[i];
                    int NEXT = numbers[i + 1];
                    numbers[i + 1] = EX;
                    numbers[i] = NEXT;
                    cycle = true;
                    System.out.println("numbers " + i + " = " + numbers[i]);
                    System.out.println("-----");
                    cycle = true;
                }
            }
        }
        for (int i=0; i<numbers.length; i++)
            System.out.println("numbers " + i + " = " + numbers[i]);
            System.out.println("Хоспаде, наконец-то я это сделал");
    }
}



//        Random random = new Random();
//        int[] arr1 = new int[5];
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = random.nextInt(10);
//            System.out.println("arr1[" + i + "] = " + arr1[i]);
//        }


//        while (cycle) {
//            cycle = false;
//            for (int i = 0; i <= arr1.length; i++) {
//                if (arr1[i] > arr1[i + 1]) {
//                    int EX = arr1[i];
//                    int NEXT = arr1[i + 1];
//                    arr1[i + 1] = EX;
//                    arr1[i] = NEXT;
//                    cycle = true;
//                    System.out.println("arr1[" + i + "] = " + arr1[i]);
//                }
//                System.out.println("---");
//            }
//
//        }
//        System.out.println("arr1[" + i + "] = " + arr1[i]);

