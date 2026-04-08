package com.maincrafts.contactmanagement.repository;

import com.maincrafts.contactmanagement.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
