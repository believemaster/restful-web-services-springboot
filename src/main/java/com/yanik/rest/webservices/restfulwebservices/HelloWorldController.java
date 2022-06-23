package com.yanik.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller
@RestController
public class HelloWorldController {
	// GET
	// URI - /hello-world
	// METHOD - "Hello World"
	
//	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
//	use above annotation or easy one below
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
}
