package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Todo;
import com.eci.cosw.springbootsecureapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping( "api" )
public class TodoController {


    @Autowired
    private TodoService ts;

    @RequestMapping( value = "/todos", method = RequestMethod.GET )
    public List<Todo> getTodoList(){
        return ts.getTodoList();
    }

    @RequestMapping( value = "/todos", method = RequestMethod.POST )
    public void addTodo(@RequestBody Todo todo){
        System.out.println(todo.getText());
        System.out.println(todo.getPriority());
        System.out.println(todo.getDueDate());
        ts.addTodo(todo);
    }
}
