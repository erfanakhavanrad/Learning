package broCode;

public class PrintF {

    static boolean myBoolean = true;
    static char myChar = '@';
    static String myString = "Bro";
    static int myInt = 50;
    static double myDouble = 1000;

    static float floatPrecision = 855442123987.45678F;

    public static void main(String[] args) {

        ConversionCharacters();

    }

    private static void ConversionCharacters() {
        //        Conversion Character
        System.out.printf("%b", myBoolean);
        System.out.println();
        System.out.printf("%c", myChar);
        System.out.println();
        System.out.printf("%s", myString);
        System.out.println();
        System.out.printf("%d", myInt);
        System.out.println();
        System.out.printf("%f", myDouble);
        System.out.println();
        System.out.println("***************");
        System.out.println();

        // Width
        System.out.printf("Hello %10s", myString);

        // flags
        System.out.printf("'You have this much money %f", floatPrecision);

        // Precision
        System.out.println(floatPrecision);
        System.out.printf("You have this much money %,2f", floatPrecision);


    }


}
