package edu.fatec.exemplo.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/movie")
public class MoviesController {
	
	@RequestMapping("")
	@ResponseBody
	public String helloWorld() {
		return "Hello World";
	}
	@RequestMapping (value = "/message", 
					method = RequestMethod.GET,
					produces = "application/json")
	public @ResponseBody Message getMessage() {
		return new Message(200, "HelloWorld");
	}
	
	@RequestMapping (value = "/message", 
			method = RequestMethod.POST,
			produces = "application/json",
			consumes = "application/json")
	public @ResponseBody Message printMessage(@RequestBody Message message) {
		System.out.println(message);
		return message;
	}

}
