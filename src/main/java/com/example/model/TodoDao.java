package com.example.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class TodoDao implements Dao<Todo> {

	private List<Todo> todoList = new ArrayList<>();

	@Override
	public Optional<Todo> get(int id) {
		return Optional.ofNullable(todoList.get(id));
	}

	@Override
	public Collection<Todo> getAll() {
		System.out.println("TodoDao.getAll()");
		System.out.println("return" + todoList.stream().filter(Objects::nonNull)
				.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList)));
		return todoList.stream().filter(Objects::nonNull)
				.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
	}

	@Override
	public int save(Todo todo) {
		System.out.println("TodoDao.save()");
		todoList.add(todo);
		int index = todoList.size();
		System.out.println("TodoDao.index" + index);
		todo.setId(index);
		return index;
	}

	@Override
	public void delete(Todo todo) {
		System.out.println("TodoDao.delete()");
		todoList.set(todo.getId() - 1, null);
	}

}