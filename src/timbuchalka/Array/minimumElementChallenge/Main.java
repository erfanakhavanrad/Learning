package timbuchalka.Array.minimumElementChallenge;

import java.util.Scanner;

/**
 * @author Erfan Akhavan Rad
 * @created 06/11/2023
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Enter the size of the array:");
//        int[] ints = readIntegers(scanner.nextInt());
//        System.out.println(Arrays.toString(ints));
        int[] test = {552,21,2,96,100,33};
        int min = findMin(test);
        System.out.println("MIN IS: "+ min);
    }

    private static int[] readIntegers(int lengthOfArray) {
        int[] myArray = new int[lengthOfArray];
        int counter = 1;
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Now enter the element " + counter++ + " of the array.");
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    private static int findMin(int[] array){
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
//            temp = array[i];
            if (temp < array[i+1]){
                continue;
//                findMin(array);
                // Desired value
            } else {
            temp = array[i+1];
            }
        }
        return temp;
    }

}
