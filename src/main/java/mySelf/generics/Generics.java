package mySelf.generics;

import mySelf.polymorphism.Animal;
import mySelf.polymorphism.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Erfan Akhavan Rad
 * @created 04/13/2024
 */
public class Generics {
    public static void main(String[] args) {

        Printer<Dog> printer = new Printer<Dog>(new Dog());
        printer.print();

//        Printer<Double> printerDouble = new Printer<>();
//        printerDouble.print();
        System.out.println();
        shout("James", 643);
        shout(123, "Karim");
        System.out.println();

        List<Dog> dogArrayList = new ArrayList<>();
        dogArrayList.add(new Dog());
        printList(dogArrayList);


    }

    private static <T, V> T shout(T thingToShout, V otherThingToShout) {
        System.out.println("Shouting at " + thingToShout + ", " + otherThingToShout);
        return thingToShout;
    }

    private static void printList(List<? extends Animal> myList) {
        System.out.println(myList);
    }

}
