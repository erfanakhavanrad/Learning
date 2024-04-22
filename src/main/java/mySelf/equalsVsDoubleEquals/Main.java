package mySelf.equalsVsDoubleEquals;

/**
 * @author Erfan Akhavan Rad
 * @created 04/19/2024
 */
public class Main {
    public static void main(String[] args) {

        String string1 = "hello";
        String string2 = "hello";
        String string3 =new String( "hello");
        String string4 = new String("hello");

        if (string1 == string2){
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

        if (string3 == string4){
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

        if (string3.equals(string4)){
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

    }
}
