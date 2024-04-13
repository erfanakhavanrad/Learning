package mySelf.upcastingAndDowncasting;

/**
 * @author Erfan Akhavan Rad
 * @created 04/04/2024
 */
public class Main {


    public static void main(String[] args) {


        Animal myAnimal = new Dog(); // Upcasting

        Cat myCat = new Cat();

        doAnimalStuff(myAnimal);

        System.out.println();

        doAnimalStuff(myCat);

    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        // DownCasting
        if (animal instanceof Dog) {
            Dog myDog = (Dog) animal;
            myDog.growl();
        }
    }
}