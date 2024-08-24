package mySelf.aop;

import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactsService {

    List<Contact> inputList = new ArrayList<>();

    public List<Contact> getContacts() {
        return initializeContacts();
    }

    public Contact getContact(Long id) {
        return inputList.get(Math.toIntExact(id));
    }

    private List<Contact> initializeContacts() {
        inputList.add(Contact.builder().id(1L).name("Erfan").age(23).build());
        inputList.add(Contact.builder().id(1L).name("Mehrdad").age(32).build());
        inputList.add(Contact.builder().id(1L).name("Roxana").age(26).build());
        inputList.add(Contact.builder().id(1L).name("Payam").age(39).build());
        return inputList;
    }

}