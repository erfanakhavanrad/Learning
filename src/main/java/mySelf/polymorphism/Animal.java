package mySelf.polymorphism;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Erfan Akhavan Rad
 * @created 04/04/2024
 */
@Getter
@Setter
public abstract class Animal {
    private String name;
    private String color;

    public void eat() {
        System.out.println("Munch");
    }

    public abstract void drink();

}
