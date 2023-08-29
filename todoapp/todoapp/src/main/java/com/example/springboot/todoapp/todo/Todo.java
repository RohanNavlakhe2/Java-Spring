package com.example.springboot.todoapp.todo;

import java.util.Objects;

import com.example.springboot.todoapp.util.validation.AtLeastOneNotBlank;


@AtLeastOneNotBlank(value = {"title","description"},
message = "Both Title and Description cannot be empty")
public class Todo {
	
	private int id;
	private String title;
	private String description;
	private boolean completed;

	public Todo(int id, String title, String description, boolean completed) {
		super();
	 	this.id = id;
		this.title = title;
		this.description = description;
		this.completed = completed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean isCompleted) {
		this.completed = isCompleted;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, id, completed, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return Objects.equals(description, other.description) && id == other.id && completed == other.completed
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", description=" + description + ", isCompleted=" + completed
				+ "]";
	}
	
	 
	
	
	
	

}
