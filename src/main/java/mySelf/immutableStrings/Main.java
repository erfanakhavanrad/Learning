package mySelf.immutableStrings;

/**
 * @author Erfan Akhavan Rad
 * @created 04/19/2024
 */
public class Main {
    public static void main(String[] args) {

        // Save memory
        String name = "John";
        String anotherName = "John";

        String thirdName = new String("John");

        System.out.println(name == anotherName);
        System.out.println(name == thirdName);

        addMoneyToAccount("Erfan", 1000000);
    }

        // Security
    public static void addMoneyToAccount(String accountHolder, int moneyToAdd) {
        //Business Logic
    }

        // Thread safe

}
