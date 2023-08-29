package com.example.springboot.todoapp.todo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private List<Todo> todoList = new ArrayList();
	
	public List<Todo> addTodo(Todo todo){
		todoList.add(todo);
		return todoList;
	}
	
	public List<Todo> getTodoList(){
		return todoList;
	} 

}
