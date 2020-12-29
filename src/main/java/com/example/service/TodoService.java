package com.example.service;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.model.Dao;
import com.example.model.Todo;

@Scope(value = "session")
@Component(value = "todoService")
public class TodoService {

	@Autowired
	private Dao<Todo> todoDao;
	private Todo todo = new Todo();

	public void save() {
		todoDao.save(todo);
		todo = new Todo();
	}

	public void delete() {
		todoDao.delete(todo);
		todo = new Todo();
	}

	public Collection<Todo> getAllTodo() {
		return todoDao.getAll();
	}

	public Collection<Todo> getAllTodoSortedByPriority() {
		return todoDao.getAll().stream().sorted(Comparator.comparingInt(Todo::getId)).collect(Collectors.toList());
	}

	public int saveTodo(Todo todo) {
		return todoDao.save(todo);
	}

	public Todo getTodo() {
		return todo;
	}
}