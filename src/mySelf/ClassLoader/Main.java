package mySelf.ClassLoader;

import com.timbuchalka.Abstraction.Interfaces.ITelephone;
import com.timbuchalka.List.ArrayListChallenge.Contacts;

import java.sql.DriverManager;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        printClassLoaders();
    }

    private static void printClassLoaders() throws ClassNotFoundException {

        System.out.println("Classloader of DriverManager:"
                + DriverManager.class.getClassLoader());

        System.out.println("Classloader of ArrayList:"
                + ArrayList.class.getClassLoader());

        System.out.println("Class Loader for Contacts: " + Contacts.class.getClassLoader());
        System.out.println();
        System.out.println("Class Loader for ITelephone: " + ITelephone.class.getClassLoader());
    }
}
