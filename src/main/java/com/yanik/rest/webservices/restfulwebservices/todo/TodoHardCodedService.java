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
	}

	public List<Todo> findAll() {
		return todos;
	}
}
