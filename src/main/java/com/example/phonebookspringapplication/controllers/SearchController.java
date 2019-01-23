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
public class SearchController {

    @Autowired
    ContactDataBase contactDataBase;

    @GetMapping("/search")
    public String search(Model model){
        model.addAttribute("contact", new Contact());
        return "search";
    }

    @PostMapping("/search")
    public String findContact(@ModelAttribute Contact contact,Model model){
        model.addAttribute("searchResults",contactDataBase.findByLastName(contact));
        return "search-results";
    }

}
