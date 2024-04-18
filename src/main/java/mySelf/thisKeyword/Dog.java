package mySelf.thisKeyword;

/**
 * @author Erfan Akhavan Rad
 * @created 04/15/2024
 */
public class Dog {

    private String name;
    private int age;

    // Empty constructor with default value.
    public Dog(){
        this("Fido",0);
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void bark() {
        System.out.println("Bark!");
    }

}
