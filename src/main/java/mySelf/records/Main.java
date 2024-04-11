package mySelf.records;

/**
 * @author Erfan Akhavan Rad
 * @created 04/02/2024
 */
public class Main {

    public static void main(String[] args) {

        EmployeeClass employeeClass = new EmployeeClass("Jerry", 425321);
        System.out.println(employeeClass);

        System.out.println();

        EmployeeRecord employeeRecord = new EmployeeRecord("Tim", 76543);
        System.out.println(employeeRecord);
        EmployeeRecord.printWhatever();
        System.out.println(employeeRecord.nameInUpperCase());
    }

}
