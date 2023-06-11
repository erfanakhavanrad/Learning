package com.timbuchalka.array.arrayChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sortedArray = sortIntegers(myIntegers);
        printArray(sortedArray);
        ////        int[] myArray = {106, 26, 81, 5, 15};
//        int[] myArray;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How long should the array be?");
//        myArray = new int[scanner.nextInt()];
//       int[] secondArray = new int[myArray.length];
//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[i] >= myArray[i+1]){
//
//            }
//        }

    }

    private static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    private static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
