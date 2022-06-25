package com.yanik.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCodedService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter = 0;

	static {
		todos.add(new Todo(++idCounter, "Yanik", "Learn To Code", new Date(), false));
		todos.add(new Todo(++idCounter, "Yanik", "Learn About Microservice", new Date(), false));
		todos.add(new Todo(++idCounter, "Yanik", "Learn About Devops", new Date(), false));
		todos.add(new Todo(++idCounter, "Yanik", "Learn About UI/UX", new Date(), false));
	}

	public List<Todo> findAll() {
		return todos;
	}
	
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		todos.remove(todo);
		
		if(todo == null) {
			return null;
		}
		
		if(todos.remove(todo)) {
			return todo;
		}
		
		return null;
	}

	public Todo findById(long id) {
		for(Todo todo:todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
}
