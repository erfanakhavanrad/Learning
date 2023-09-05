package broCode;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String stringName = "bro";
        boolean result = stringName.equals("Bro");
        boolean result2 = stringName.equalsIgnoreCase("Bro");

        System.out.println(result);
        System.out.println(result2);

        int resultInt = stringName.length();
        System.out.println(resultInt);

        char resultChar = stringName.charAt(0);
        System.out.println(resultChar);

        int position = stringName.indexOf("b");
        System.out.println(position);

        boolean isEmpty = stringName.isEmpty();
        System.out.println(isEmpty);
//        stringName = "";
        isEmpty = stringName.isEmpty();
        System.out.println(isEmpty);

        String upperCase = stringName.toUpperCase();
        System.out.println(upperCase);
        String lowerCase = stringName.toLowerCase();
        System.out.println(lowerCase);

        String extraSpaces = "     ***       " + stringName + "   ***   ";
        System.out.println(extraSpaces);
        System.out.println(extraSpaces.trim());

        String replaced = stringName.replace('b', 'T');
        System.out.println(replaced);

    }
}
