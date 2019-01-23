package com.example.phonebookspringapplication.controllers;

import com.example.phonebookspringapplication.model.Contact;
import com.example.phonebookspringapplication.model.ContactDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RemoveController {

    @Autowired
    ContactDataBase contactDataBase;

    public RemoveController() {
    }

    @GetMapping("/remove")
    public String remove(Model model){
        model.addAttribute("contact",new Contact());
        return "remove";
    }

    @PostMapping("/remove")
    public String removeContact(@ModelAttribute Contact contact){
        contactDataBase.getContactList().remove(contact);
        return "remove";
    }
}
