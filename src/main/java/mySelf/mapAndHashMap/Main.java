package mySelf.mapAndHashMap;

import java.util.HashMap;

/**
 * @author Erfan Akhavan Rad
 * @created 04/19/2024
 */
public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> employeeIds = new HashMap<>();
        employeeIds.put("John", 6543);
        employeeIds.put("Carl", 8427);
        employeeIds.put("Jerry", 7274);
        System.out.println(employeeIds);
        System.out.println(employeeIds.get("Carl"));
        System.out.println(employeeIds.containsKey("George"));
        System.out.println(employeeIds.containsValue(6543));

        System.out.println();
        employeeIds.put("Carl", 4213);
        employeeIds.putIfAbsent("Rick", 4213);
        employeeIds.replace("DoomGuy", 87654);
        employeeIds.remove("Carl");
        System.out.println(employeeIds);

    }
}
