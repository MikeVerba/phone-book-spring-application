package com.example.phonebookspringapplication.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContactDataBase {


    private List<Contact> contactList;

    public ContactDataBase() {
        contactList = new ArrayList<>();
    }


    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}

