package com.example.jour3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jour3.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByName(String name); 
    List<Person> findByAge(int age);
}
