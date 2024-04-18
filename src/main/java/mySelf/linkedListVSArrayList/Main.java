package mySelf.linkedListVSArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Erfan Akhavan Rad
 * @created 04/19/2024
 */
public class Main {
    public static void main(String[] args) {

        // Add and Remove are much faster in LinkedList compared to ArrayList
        // Getting an element in ArrayList is much faster because of Random Access but in LinkedList it's much slower.
        // because it has to start from the beginning of it.

        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");
        for (String name : namesLinkedList) {
            System.out.println(name);
        }
        namesLinkedList.add(2, "Rick");
        System.out.println();
        for (String name : namesLinkedList) {
            System.out.println(name);
        }

        System.out.println("####################");

        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        namesArrayList.add("Ringo");
        for (String name : namesArrayList) {
            System.out.println(name);
        }
        namesArrayList.add(2, "Rick");
        System.out.println();
        for (String name : namesArrayList) {
            System.out.println(name);
        }

    }
}
