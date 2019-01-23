package com.example.phonebookspringapplication.controllers;

import com.example.phonebookspringapplication.model.ContactDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DatabaseController {

    @Autowired
    ContactDataBase contactDataBase;

    @GetMapping("/database")
    public String getDatabase(Model model){
        model.addAttribute("contactList",contactDataBase.getContactList());
        return "database";
    }
}
