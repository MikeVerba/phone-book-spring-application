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
public class SubmissionFormController {

    @Autowired
    ContactDataBase contactDataBase;

    public SubmissionFormController() {
    }

    @GetMapping("/submission-form")
    public String phonebookSubmissionForm(Model model){
        model.addAttribute("contact",new Contact());
        return "submission-form";
    }

    @PostMapping("/submission-form")
    public String contactSubmit(@ModelAttribute Contact contact){
        contactDataBase.getContactList().add(contact);
        //System.out.println(contact);

        return "contact";
    }
}
