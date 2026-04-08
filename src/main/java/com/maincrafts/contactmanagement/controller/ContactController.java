package com.maincrafts.contactmanagement.controller;

import com.maincrafts.contactmanagement.entity.Contact;
import com.maincrafts.contactmanagement.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactRepository repo;

    @GetMapping
    public List<Contact> getAll() {
        return repo.findAll();
    }
}
