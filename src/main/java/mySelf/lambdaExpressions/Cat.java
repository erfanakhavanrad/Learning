package mySelf.lambdaExpressions;

import lombok.Data;

/**
 * @author Erfan Akhavan Rad
 * @created 04/12/2024
 */
@Data
public class Cat implements Printable {
    private String name;
    private Integer age;

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }

    @Override
    public String print(String name) {
        System.out.println("Print with paws.");
        return null;
    }



}
