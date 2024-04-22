package mySelf.innerClass;

/**
 * @author Erfan Akhavan Rad
 * @created 04/19/2024
 */
public class OuterClass {

    int number = 6;

    public void heyThere(){
        System.out.println("Hey there!");

        class LocalInnerClass{
            String localInnerClassVariable = "Here's Johnny";
            public void printLocalInnerClassVariable(){
                System.out.println(localInnerClassVariable);
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.printLocalInnerClassVariable();

    }

    public static class InnerClass{

        int innerNumber = 8;
        public void whatsUp(){
            System.out.println("What's up from inner class.");
        }

    }


}
