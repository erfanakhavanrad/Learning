package mySelf.optional;

import mySelf.reflection.Cat;

import java.util.Optional;

/**
 * @author Erfan Akhavan Rad
 * @created 04/12/2024
 */
public class Optionals {
    public static void main(String[] args) {

        Optional<Cat> optionalCat = findCatByName("Fred");
        if (optionalCat.isPresent()) {
            System.out.println(optionalCat.get().getName() + " " + optionalCat.get().getAge());
        } else System.out.println("Nothing");

        System.out.println();

        Cat myCatOrElse = optionalCat.orElse(new Cat("UNKNOWN", 3333));

//        Cat myCatOrElseGet = optionalCat.orElseGet(new Cat("UNKNOWN",0));

        System.out.println("Here "+optionalCat.map(Cat::getAge).orElse(0));

        Cat myCatOrElseThrow = optionalCat.orElseThrow();


    }

    public static Optional<Cat> findCatByName(String name) {
        Cat myCat = new Cat("Fred", 3);
        if (myCat.getName().equals(name))
            return Optional.ofNullable(myCat);
        else return Optional.empty();
    }

}
