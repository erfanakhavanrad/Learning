package mySelf.String;

public class Main {
    public static void main(String[] args) {
        String myString = "this is me.";

        System.out.println(myString);
        String format = String.format("%%%s%%", myString);
        System.out.println(format);

    }

    public double calculate(int a345, int b) {
        System.out.println(a345 + b);
        return a345 + b;
    }

    public String calculate(double aadawd, int b) {
        System.out.println(aadawd + b);
        return "a + b";
    }

}
