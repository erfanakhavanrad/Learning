package joma;

import algorithms.joma.JomaAlgorithms;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Erfan Akhavan Rad
 * @created 05/10/2023
 */
public class JomaAlgorithmsTest {

    private JomaAlgorithms jomaAlgorithms;

    @Before
    public void setup() {
        jomaAlgorithms = new JomaAlgorithms();
    }

    @Test
    public void printTest() {
        jomaAlgorithms.print();
    }

    @Test
    public void distributeBonusesTest() {
        int[] employeesPerformance = {1, 2, 3, 2, 3, 5, 1};
        int[] employeesBonuses = {1, 2, 3, 1, 2, 3, 1};
        int[] results = jomaAlgorithms.distributeBonuses(employeesPerformance);
        Assert.assertArrayEquals(employeesBonuses, results);
    }

    @Test
    public void swapEveryTwoNodesTest(){
        jomaAlgorithms.swapEveryTwoNodes();
//[2, 1, 4, 3, 5]
    }

}
