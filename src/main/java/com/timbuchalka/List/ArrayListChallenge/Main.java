package com.timbuchalka.List.ArrayListChallenge;

import java.util.Scanner;

/**
 * @author Erfan Akhavan Rad
 * @created 06/29/2023
 */
public class Main {
    private static MobilePhone mobilePhone = new MobilePhone();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    add();
                    break;
                case 2:
                    modify();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    contactsList();
                    break;
                case 6:
                    quit = true;
                    break;
                case 7:
                    String name = "erfan";
                    String number = "09353368";
                    mobilePhone.addNewContact(name, number);

                    String name2 = "erfan2";
                    String number2 = "09";
                    Contacts contacts = new Contacts();
                    contacts.setNumber(number2);
                    contacts.setName(name2);

                    mobilePhone.modifyContact(name, contacts);
                    break;

            }
        }
    }

    private static void printInstructions() {
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To add a new contact.");
        System.out.println("\t 2 - To modify contact.");
        System.out.println("\t 3 - To remove contact.");
        System.out.println("\t 4 - To search contact.");
        System.out.println("\t 5 - To see all contacts.");
        System.out.println("\t 6 - To turn off mobilePhone.");
    }

    private static void add() {
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.println("Enter contact number:");
        String number = scanner.nextLine();
        System.out.println(number);
        mobilePhone.addNewContact(name, number);
    }

    private static void modify() throws Exception {
        System.out.println("Which contact would you like to edit?");
        contactsList();

//        Contacts contacts = new Contacts();
        String currentName = scanner.nextLine();
        System.out.println("Enter the new name, tab for cancel.");
        String name = scanner.nextLine();
//        contacts.setName(name);
        System.out.println("Enter the new number, tab for cancel.");
        String number = scanner.nextLine();
//        contacts.setNumber(number);
//        }
        Contacts contacts = Contacts.createContact(name, number);
        mobilePhone.modifyContact(currentName, contacts);
        contactsList();
    }

    private static void remove() throws Exception {
        System.out.println("Which contact would you like to remove?");
        contactsList();

        String currentName = scanner.nextLine();
        mobilePhone.deleteContact(currentName);
        contactsList();
    }

    private static void search() throws Exception {
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        boolean contact = mobilePhone.findContact(name);
        if (contact) System.out.println("Contact " + name + " exists.");
        else System.out.println("Contact " + name + " doesn't exist.");
    }

    private static void contactsList() {
        if (mobilePhone.contactsArrayList.size() > 0) {
            int temp = 1;
            for (int i = 0; i < mobilePhone.contactsArrayList.size(); i++) {
                temp = i + 1;
                System.out.println(temp + "- " + mobilePhone.contactsArrayList.get(i).getName() + ":\t" + mobilePhone.contactsArrayList.get(i).getNumber());
            }
        } else {
            System.out.println("You don't have any contacts yet.");
        }


    }


}
