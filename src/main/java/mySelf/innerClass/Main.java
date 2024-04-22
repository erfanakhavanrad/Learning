package mySelf.innerClass;

/**
 * @author Erfan Akhavan Rad
 * @created 04/19/2024
 */
public class Main {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        outerClass.heyThere();

        // Non-Static Initialization
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.whatsUp();






    }
}
