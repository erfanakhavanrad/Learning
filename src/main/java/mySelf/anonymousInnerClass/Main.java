package mySelf.anonymousInnerClass;

import mySelf.superKeyword.Animal;

/**
 * @author Erfan Akhavan Rad
 * @created 04/22/2024
 */
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeNoise();

        Animal bigFoot = new Animal() {
            @Override
            public void makeNoise() {
                System.out.println("Making BigFoot noises.");
            }
        };
        bigFoot.makeNoise();

        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous runnable interface.");
            }
        };
        anonymousRunnable.run();
    }
}
