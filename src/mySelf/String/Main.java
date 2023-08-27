package mySelf.String;

public class Main {
    public static void main(String[] args) {
        String myString = "this is me.";

        System.out.println(myString);
        String format = String.format("%%%s%%", myString);
        System.out.println(format);

    }

}
