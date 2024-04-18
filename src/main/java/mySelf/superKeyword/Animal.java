package mySelf.superKeyword;

/**
 * @author Erfan Akhavan Rad
 * @created 04/15/2024
 */
public class Animal {
    int age;
    String name;

    public Animal() {
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Base animal is making a noise.");
    }

    public void eat() {
        System.out.println("Base animal is making a eating.");
    }

}
