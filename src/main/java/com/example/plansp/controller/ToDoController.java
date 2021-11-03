package com.example.plansp.controller;

import com.example.plansp.entities.Todo;
import com.example.plansp.repository.IToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ToDoController {
    @Autowired
    IToDo iToDo;

    @GetMapping("/")
    public String findAll(Model model){
        List<Todo> toDoList = iToDo.findAll();
        model.addAttribute("toDoList", toDoList);
        return "home/index";
    }

    @PostMapping("/save")
    public String save(Todo todo, Model model){
        Todo aToDo = new Todo();
        model.addAttribute("todo", aToDo);

        iToDo.save(todo);
        return "home/index";
    }
}
