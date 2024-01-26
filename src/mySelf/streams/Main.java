package mySelf.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Erfan Akhavan Rad
 * @created 01/22/2024
 */
public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Warren Buffet", 20));
        people.add(new Person("Erfan Akhavan Rad", 130));
        people.add(new Person("Elon Musk", 220));
        people.add(new Person("Mark Zuckerberg", 80));
        people.add(new Person("Bill Gates", 200));

        List<Person> hundredClub = people.stream().filter(person -> person.billions >= 100).collect(Collectors.toList());
        List<Person> sortedList = people.stream().sorted(Comparator.comparing(person -> person.name))
                .toList();

        List<Person> wealthiest = people.stream().sorted(Comparator.comparing(person -> person.billions)).toList();

        // Oldschool Method
//        List<Person> hundredClub = new ArrayList<>();
//        for (Person p : people) {
//            if (p.billions >= 100) {
//                hundredClub.add(p);
//            }
//        }

        hundredClub.forEach(person -> System.out.println(person.name));
        System.out.println("****************************************");
        sortedList.forEach(person -> System.out.println(person.name + " " + person.billions));
        System.out.println("****************************************");
        wealthiest.forEach(person -> System.out.println(person.name + " " + person.billions));


    }

    static class Person {
        String name;
        int billions;

        public Person(String name, int billions) {
            this.name = name;
            this.billions = billions;
        }
    }

}
