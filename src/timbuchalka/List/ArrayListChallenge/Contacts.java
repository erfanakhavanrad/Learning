package timbuchalka.List.ArrayListChallenge;

/**
 * @author Erfan Akhavan Rad
 * @created 06/29/2023
 */
public class Contacts {
    private String name;
    private String number;


    public Contacts() {
    }

    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static Contacts createContact(String name, String number) {
        return new Contacts(name, number);
    }

}
