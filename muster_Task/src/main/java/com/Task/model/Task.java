package com.Task.model;

import java.sql.Date;

public class Task {
	private int id;
	private String title;
	private String description;
	private Date dueDate;
	private boolean isComplete;

	// Constructor
	public Task(int id, String title, String description, java.sql.Date dueDate, boolean isComplete) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		this.isComplete = isComplete;
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

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
}
