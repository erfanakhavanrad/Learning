package timbuchalka.Array.reverseArrayChallenge;

import java.util.Arrays;

/**
 * @author Erfan Akhavan Rad
 * @created 06/19/2023
 */
public class Main {

    public static void main(String[] args) {
        int[] myArray = {1, 3, 5, 7, 8, 9};
        reverse(myArray);
    }

    private static void reverse(int[] array) {
        System.out.println("Original array was: " + Arrays.toString(array));

        int maxIndex = array.length-1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }

        System.out.println("Reversed array is: " + Arrays.toString(array));
    }


}
