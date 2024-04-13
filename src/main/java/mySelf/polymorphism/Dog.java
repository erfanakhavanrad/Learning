package mySelf.polymorphism;

import java.io.Serializable;

/**
 * @author Erfan Akhavan Rad
 * @created 04/04/2024
 */
public class Dog extends Animal implements Serializable {

    @Override
    public void eat() {
        super.eat();
        System.out.println("Eating food.");
    }

    @Override
    public void drink() {
        System.out.println("Drinking water shloop shloop");
    }

    public void eat(String food) {
        super.eat();
        System.out.println("Eating " + food + " food.");
    }

}
