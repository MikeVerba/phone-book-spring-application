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

    public List<Contact> findByLastName(Contact contact){
        List<Contact> results = new ArrayList<>();

        for(int i = 0;i<contactList.size();i++){
            if(contact.getLastName().equals(contactList.get(i).getLastName())){
                results.add(contactList.get(i));
            }
        }

        return results;
    }
}

