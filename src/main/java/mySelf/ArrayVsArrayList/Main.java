package mySelf.ArrayVsArrayList;

import java.util.ArrayList;

/**
 * @author Erfan Akhavan Rad
 * @created 04/14/2024
 */
public class Main {
    public static void main(String[] args) {

        // Arrays are fixed in size. Can be type of anything.
        String[] namesArray = new String[5];
        int[] counterArray = {1, 2, 3, 4, 5};
        namesArray[0] = "John";
        namesArray[1] = "Erfan";
        namesArray[2] = "Chris";
        namesArray[3] = "Leon";
        namesArray[4] = "Ada";

        for (int i = 0; i < namesArray.length; i++) {
            System.out.println("namesArray " + i + " " + namesArray[i]);
        }

        System.out.println();

        // ArrayLists are not fixed in size. Can be type of objects and Wrapper Classes.
        ArrayList<Integer> counterArrayList = new ArrayList<>();
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Erfan");
        namesArrayList.add("Chris");
        namesArrayList.add("Leon");

        namesArrayList.add("Ethan");
        for (int i = 0; i < namesArrayList.size(); i++) {
            System.out.println("namesArrayList " + namesArrayList.get(i));
        }


        System.out.println();

        // Assign new element
        namesArray[0] = null;
        for (int i = 0; i < namesArray.length; i++) {
            System.out.println("namesArray " + i + " " + namesArray[i]);
        }
        System.out.println();
        namesArrayList.set(0, "Carl");
        for (int i = 0; i < namesArrayList.size(); i++) {
            System.out.println("namesArrayList " + namesArrayList.get(i));
        }

        namesArrayList.remove(0);
        namesArrayList.remove("Chris");
        System.out.println("**************************");
        for (int i = 0; i < namesArrayList.size(); i++) {
            System.out.println("namesArrayList " + namesArrayList.get(i));
        }

        System.out.println();
        System.out.println();


        System.out.println(namesArray); // Prints Array memory address
        System.out.println(namesArrayList); // It is also a part of Collection, so I have access to all those methods too.


    }
}
