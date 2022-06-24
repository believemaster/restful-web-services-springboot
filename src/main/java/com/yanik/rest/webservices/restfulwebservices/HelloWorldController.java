package com.yanik.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Controller
@RestController
@CrossOrigin(origins="http://localhost:4200")		// allowing react-app to request from the url so to make cross origin set the origin
public class HelloWorldController {
	// GET
	// URI - /hello-world
	// METHOD - "Hello World"
	
//	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
//	use above annotation or easy one below
	@GetMapping(path="/api/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	// hello-world-bean
	@GetMapping(path="/api/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	// hello-world/path-variable/yanik
	@GetMapping(path="/api/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
//		throw new RuntimeException("Something went wrong"); // to test exceptino in frontend to handle and error testing uncomment this
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
}
