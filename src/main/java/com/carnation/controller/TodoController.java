package com.carnation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carnation.model.Todo;
import com.carnation.service.TodoService;

@RestController

public class TodoController {
	@Autowired
	TodoService todoService;
	
	@PostMapping("/savetodo")
	public Todo saveTodo(@RequestBody Todo todo) {
		return todoService.saveTodo(todo);
	}
	 
	@GetMapping("/get-todo/{name}")
	public Todo getTodoUsingName(@PathVariable("name") String name) {
		return todoService.getTodoUsingName(name);
	}
}
