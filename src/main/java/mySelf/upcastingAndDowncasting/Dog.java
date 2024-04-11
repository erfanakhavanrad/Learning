package mySelf.upcastingAndDowncasting;

/**
 * @author Erfan Akhavan Rad
 * @created 04/04/2024
 */
public class Dog extends Animal {
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Woof woof!");
    }

    public void growl(){
        System.out.println("Grrrrrrrr");
    }

}
