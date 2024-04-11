package mySelf.records;

/**
 * @author Erfan Akhavan Rad
 * @created 04/02/2024
 */
public record EmployeeRecord(String name, int employeeNumber) implements Runnable {

    //    public  final String something; This is forbidden.
    public static final String DEFAULT_NAME = "George";

    public EmployeeRecord(String name, int employeeNumber) {
        if (employeeNumber < 0) {
            throw new IllegalStateException("Employee number cannot be negative.");
        }
        this.name = name;
        this.employeeNumber = employeeNumber;
    }


    public String nameInUpperCase() {
        return name.toUpperCase();
    }

    public static void printWhatever() {
        System.out.println("Whatever");
    }


    @Override
    public void run() {

    }
}
