package mySelf.enums;

/**
 * @author Erfan Akhavan Rad
 * @created 04/17/2024
 */
public class Main {
    public static void main(String[] args) {

        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;

        if (day == DaysOfTheWeek.FRIDAY) {
            System.out.println("It's the weekend.");
        }

        System.out.println();

        for (DaysOfTheWeek today : DaysOfTheWeek.values()) {
            System.out.println(today);
        }
        System.out.println();

        for (Cereals cereals : Cereals.values()) {
            System.out.println(cereals + ": " + cereals.price + "$");
            System.out.println("Level of deliciousness: " + cereals.levelOfDeliciousness);
            System.out.println("###########");
        }


    }
}
