package mySelf.aop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactsController {

    private final ContactsService contactsService;

    public ContactsController(ContactsService contactsService) {
        this.contactsService = contactsService;
    }

    @GetMapping()
    public List<Contact> getContacts() {
        return contactsService.getContacts();
    }

    @GetMapping("/single/{id}")
    public Contact getContact(@PathVariable Long id) {
        return contactsService.getContact(id);
    }

}
