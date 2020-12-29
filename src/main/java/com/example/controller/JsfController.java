package com.example.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "jsfController")
public class JsfController {

	public String loadTodoPage() {
		return "/todo.xhtml";
	}

}