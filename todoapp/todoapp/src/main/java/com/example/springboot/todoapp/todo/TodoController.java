package com.example.springboot.todoapp.todo;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.springboot.todoapp.util.validation.AtLeastOneNotBlankValidator;

import jakarta.validation.Valid;

@Controller
public class TodoController {
	
	private Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
	
	@Autowired
	private TodoService todoService;
	
	@Autowired
	private AtLeastOneNotBlankValidator validator;
   
	@RequestMapping("mytodos")
	public String todoList(ModelMap modelMap) {
	    logger.info("My Todos");
		modelMap.put("todoList",todoService.getTodoList());
		return "TodoList";
		
	}
	
	@RequestMapping(value = "addUpdateTodo",method = RequestMethod.GET)
	public String addUpdateTodo(ModelMap modelMap) {
		modelMap.put("todo",new Todo(25,"","",false));
		return "AddUpdateTodo";
		
	}
	
	@RequestMapping(value = "addUpdateTodo",method = RequestMethod.POST)
	public String addUpdateTodoPost(@Valid Todo todo,BindingResult result,
			ModelMap modelMap) {
		
		if(result.hasErrors()) {
			modelMap.put("error",result.getAllErrors().get(0).getDefaultMessage());
			return "AddUpdateTodo";
		}
		
		todoService.addTodo(
				new Todo(todo.getId() ,todo.getTitle(),todo.getDescription(),todo.isCompleted()));
		return "redirect:mytodos";
		
	}
	
	 
}
