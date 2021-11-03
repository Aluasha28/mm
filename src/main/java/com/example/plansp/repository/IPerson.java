package com.example.plansp.repository;

import com.example.plansp.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface IPerson extends CrudRepository<Person, Long> {
}
