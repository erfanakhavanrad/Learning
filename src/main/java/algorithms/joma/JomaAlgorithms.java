package algorithms.joma;

import java.util.LinkedList;

/**
 * @author Erfan Akhavan Rad
 * @created 05/10/2023
 */
public class JomaAlgorithms {

    public void print() {
        int i = 0;
        while (i < 200) {
            System.out.println("KB: " + (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024);
            i++;
            System.out.println(i);
        }
    }

    public int[] distributeBonuses(int[] employeesPerformance) {
        /**
         * You are the manager of a number of employees who all sit in a row. The CEO would like to give
         * bonuses to all of your employees, but since the company didn't perform so well this year the CEO
         * would like to keep the bonuses to a minimum.
         * The rules of giving bonuses is that:
         * - Each employee begins with a bonus factor if 1x.
         * - For each employee, if they perform better than the person sitting next to them, the employee is
         * given +1 higher bonus (and up to +2 if they perform better than both people to their sides.)
         *
         * Given a list of employee's performances, find the bonuses each employee should get.
         */

        int[] employeesBonuses = new int[employeesPerformance.length];

        for (int i = 0; i < employeesPerformance.length; i++) {
            if (employeesPerformance[i] == 1 || employeesPerformance[i] < employeesPerformance[i + 1] && employeesPerformance[i] < employeesPerformance[i - 1]) {
                employeesBonuses[i] = 1;
            } else {
                if (employeesPerformance[i] > employeesPerformance[i + 1] && employeesPerformance[i] > employeesPerformance[i - 1]) {
                    employeesBonuses[i] = 3;
                } else if (employeesPerformance[i] > employeesPerformance[i + 1] || employeesPerformance[i] > employeesPerformance[i - 1]) {
                    employeesBonuses[i] = 2;
                }
            }
        }
        return employeesBonuses;
    }

    public void swapEveryTwoNodes() {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        LinkedList<Integer> numbersCopy = new LinkedList<>();
        numbersCopy.add(2);
        numbersCopy.add(1);
        numbersCopy.add(4);
        numbersCopy.add(3);
        numbersCopy.add(5);
//        Iterator<Integer> iterator = numbers.iterator();
        for (int i = 0; i < numbers.size() - 1; i++) {

            if (i / 2 != 0) {
                numbersCopy.set(i, numbers.get(i + 1));
            } else if (i ==0){
                numbersCopy.set(i, numbers.get(i+1));
            } else{                numbersCopy.set(i, numbers.get(i-1));
            }
//            numbersCopy.set(i+,numbers.get(i)+1);

        }
        System.out.println(numbers.toString());
        System.out.println(numbersCopy.toString());

    }

}
