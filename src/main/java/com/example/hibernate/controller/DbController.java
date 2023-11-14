package com.example.hibernate.controller;

import com.example.hibernate.entity.Person;
import com.example.hibernate.repository.PersonsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DbController {
    private final PersonsRepository personsRepository;

    public DbController(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return personsRepository.getPersonsByCity(city);
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam String name) {
        return personsRepository.getProductName(name);
    }
}