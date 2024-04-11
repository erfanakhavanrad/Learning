package mySelf.upcastingAndDowncasting;

/**
 * @author Erfan Akhavan Rad
 * @created 04/04/2024
 */
public class Cat extends Animal {

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("MOEW");
    }

}
