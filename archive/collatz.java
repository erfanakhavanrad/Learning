import java.util.*;
public class collatz {
    //execute update and return the value
    public static int update(int number) {
        if (number % 2 == 0) {
            return number / 2;
        }
        return number * 3 + 1;
    }

    //test the conjecture
    public static void test(String[] args) {
        int round = 0, number = input;
        System.out.println("input = " + input);
        while (number > 1) {
            number = update(number);
            round++;
            System.out.printf(" %4d: %d%n", round, number);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Testing the collatz conjector");
        Scanner keyboard = new Scanner(System.in);
        int input = 1;
        while (input >= 1)
        {
            System.out.println("Enter an integer: ");
            input = keyboard.nextInt();
            if (input >= 1)
            {
               test(input);
            }
        }
        System.out.println("...quiting");
    }
}