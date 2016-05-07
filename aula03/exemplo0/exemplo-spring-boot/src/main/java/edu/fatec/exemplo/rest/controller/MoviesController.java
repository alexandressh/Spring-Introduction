package edu.fatec.exemplo.rest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	public String helloWorld(){
		return "Hello, world!";
	}
	
	@RequestMapping(value = "/message", 
				method = RequestMethod.GET,
				produces = "application/json"
				)
	
	public @ResponseBody Message getMessage() {
		return new Message(200, "Hello world");
	}
	
	@RequestMapping(value = "/message", 
			method = RequestMethod.POST,
			produces = "application/json",
			consumes = "application/json"
			)
	public @ResponseBody 
			Message printMessage(@RequestBody 
								Message message, HttpServletRequest request,
								HttpServletResponse response) {
		
		System.out.println(message);
		return message;
	}
	
	
}
