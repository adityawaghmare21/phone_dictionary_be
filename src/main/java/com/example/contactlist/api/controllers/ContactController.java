package com.example.contactlist.api.controllers;

import com.example.contactlist.api.request.ContactRequest;
import com.example.contactlist.entities.Contact;
import com.example.contactlist.services.ContactService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/contacts")
@RequiredArgsConstructor
public class ContactController {
    private final ContactService contactService;

    @CrossOrigin
    @GetMapping
    public List<Contact> getAll() {
        return contactService.getAll();
    }

    @GetMapping(path = "/{id}")
    @CrossOrigin
    public Contact getById(@PathVariable UUID id) {
        return contactService.getById(id);
    }

    @PostMapping
    @CrossOrigin
    public Contact create(@RequestBody @Valid ContactRequest request) {
        return contactService.create(request);
    }

    @PutMapping(path = "/{id}")
    @CrossOrigin
    public Contact update(@PathVariable UUID id, @RequestBody @Valid ContactRequest request) {
        return contactService.update(id, request);
    }

    @PutMapping(path = "/{id}/toggle-status")
    public Contact toggleStatus(@PathVariable UUID id) {
        return contactService.toggleStatus(id);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable UUID id) {
        contactService.delete(id);
    }
}