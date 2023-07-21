package com.timbuchalka.list.ArrayListChallenge;

import java.util.ArrayList;

/**
 * @author Erfan Akhavan Rad
 * @created 06/29/2023
 */
public class MobilePhone {

    ArrayList<Contacts> contactsArrayList = new ArrayList<>();

    public void addNewContact(String name, String number) {
        Contacts contacts = new Contacts();

        contacts.setName(name);
        contacts.setNumber(number);
        contactsArrayList.add(contacts);
    }

    public void modifyContact(String contactName, Contacts contacts) throws Exception {
//        int position = findContactPosition(contacts);
        int position = findContactPosition(contactName);
        if (position >= 0) {
            contacts.setNumber(contacts.getNumber());
            contacts.setName(contacts.getName());
            contactsArrayList.set(position, contacts);
            return;
        }
        throw new Exception("username not valid!");
    }

    private int findContactPosition(Contacts contacts) throws Exception {
//        contacts.setName("erfan");
        int position = -1;
        for (Contacts contactsLoop : contactsArrayList) {
            if (contactsLoop.getName() != null && contactsLoop.getName().contains(contacts.getName())) {
                position = contactsLoop.getName().indexOf(contacts.getName());
                if (position >= 0) return position;

            } else {
                throw new Exception("Such contact does not exists.");

            }
        }
        return position;
    }

    private int findContactPosition(String name) throws Exception {

        int position = -1;
        for (Contacts contactsLoop : contactsArrayList) {
            if (contactsLoop.getName() != null && contactsLoop.getName().contains(name)) {
                position = contactsLoop.getName().indexOf(name);
                if (position >= 0) return position;

            } else {
                throw new Exception("Such contact does not exists.");

            }
        }
        return position;
//        int position = contactsArrayList.get(0).getName().indexOf(name);
//        if (position >= 0) {
//            return position;
//        } else {
//            throw new Exception("Such contact does not exists.");
//        }
    }

    public void deleteContact(String name) throws Exception {

        int position = findContactPosition(name);

        if (position >= 0) {
            contactsArrayList.remove(position);
            return;
        }
        throw new Exception("username not valid!");
    }

    public boolean findContact(String contactName) throws Exception {
        int position = findContactPosition(contactName);

        if (position >= 0) {
            return true;
        }
        return false;
    }


}