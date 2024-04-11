package mySelf.setAndHashSet;

import java.util.*;

/**
 * @author Erfan Akhavan Rad
 * @created 04/11/2024
 */
public class SetAndHashSet {
    public static void main(String[] args) {

        // TODO: 4/12/2024 Investigate hasSet class
        // Constant time for add, remove and lookups
        Set<String> names = new HashSet<>();
        names.add("Walter");
        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");

//        names.remove(0);

        System.out.println(names.size());
        System.out.println(names.contains("saul"));
        System.out.println(names.isEmpty());
        System.out.println(names);
//        names.clear();
//        System.out.println();
//        System.out.println(names);

        System.out.println("Enhanced Loop");
        for (String name : names) {
            System.out.println(name);
        }

        names.forEach(System.out::println);

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }


        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(5);
        numberList.add(3);
        numberList.add(4);
        numberList.add(3);
        System.out.println(numberList);

        Set<Integer> numberSet = new HashSet<>(numberList);
        System.out.println(numberSet);

        // Slower than hash. Maintains natural order of data.
        Set<String> namesTreeSet = new TreeSet<>();
        names.add("Walter");
        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");
        System.out.println(namesTreeSet);


        // Close to hashset in terms of speed. Maintains insertion order of data.
        Set<String> namesLinkedHashSet = new LinkedHashSet<>();
        names.add("Walter");
        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");
        System.out.println(namesLinkedHashSet);


    }
}
