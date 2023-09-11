package com.carnation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnation.model.Todo;
import com.carnation.repository.TodoRepository;

@Service
public class TodoService {
	
	 @Autowired
	TodoRepository todoRepository;
	
	public Todo saveTodo(Todo todo) {
		return todoRepository.save(todo);
	   
	 }
	public Todo getTodoUsingName(String name) {
		return todoRepository.findByName(name);
	}
	
}
