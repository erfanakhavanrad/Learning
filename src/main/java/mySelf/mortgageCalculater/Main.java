package mySelf.mortgageCalculater;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author Erfan Akhavan Rad
 * @created 04/19/2024
 */
public class Main {
    private static final int MONTH_IN_A_YEAR = 12;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount.");
        double principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate:");
        float annualInterestRate = scanner.nextFloat();

        System.out.println("Enter the term in years:");
        int termInYears = scanner.nextInt();

        scanner.close();

        float monthlyInterestRate = annualInterestRate / MONTH_IN_A_YEAR;
        int numberOfPayments = termInYears * MONTH_IN_A_YEAR;

        double monthlyPayment = principal * (
                (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments))) /
                        ((Math.pow(1 + monthlyInterestRate, numberOfPayments)) - 1)
        );

        System.out.println("Monthly payment: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));
        System.out.println("Total payback amount: " + NumberFormat.getCurrencyInstance().format(numberOfPayments * monthlyPayment));

    }
}
