package mySelf.generics;

import lombok.Data;
import mySelf.polymorphism.Animal;

import java.io.Serializable;

/**
 * @author Erfan Akhavan Rad
 * @created 04/13/2024
 */
@Data
public class Printer<T extends Animal & Serializable> {
    T printThing;


    public Printer(T printThing) {
        this.printThing = printThing;
    }

    public void print() {
        printThing.eat();
        if (printThing != null)
            System.out.println(printThing);
    }

}
