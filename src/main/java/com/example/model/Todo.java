package com.example.model;

import java.util.Date;

public class Todo {

	private Integer id;
	private String message;
	private Date deadline;

	public Integer getId() {
		System.out.println("Todo.getId()");
		return id;
	}

	public void setId(Integer id) {
		System.out.println("Todo.setId()");
		this.id = id;
	}

	public String getMessage() {
		System.out.println("Todo.getMessage()");
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Todo.setMessage()");
		this.message = message;
	}

	public Date getDeadline() {
		System.out.println("Todo.getDeadline()" + deadline);

		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

}