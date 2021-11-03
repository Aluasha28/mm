package com.example.plansp.repository;

import com.example.plansp.entities.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IToDo extends CrudRepository<Todo, Long> {
    @Override
    public List<Todo> findAll();
}
