package mySelf.superKeyword;

/**
 * @author Erfan Akhavan Rad
 * @created 04/15/2024
 */
public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat(3, "George", "Purina One");
        myCat.makeNoise();
        System.out.println(myCat.age + " " + myCat.name + " " + myCat.catFoodPreference);
    }
}
