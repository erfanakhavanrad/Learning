package mySelf.polymorphism;

/**
 * @author Erfan Akhavan Rad
 * @created 04/04/2024
 */
public class Main {
    public static void main(String[] args) {

        Animal myAnimal = new Animal() {
            @Override
            public void drink() {
                System.out.println("In main class");
            }
        };
        myAnimal.eat();

        Dog myDog = new Dog();
        myDog.drink();
        System.out.println();
        myDog.eat();

        myDog.eat("Bone");

    }
}
