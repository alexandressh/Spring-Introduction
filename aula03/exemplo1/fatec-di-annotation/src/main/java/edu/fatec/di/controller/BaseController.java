package edu.fatec.di.controller;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


/** 
 * http://www.baeldung.com/global-error-handler-in-a-spring-rest-api
 * 
 * */
@ControllerAdvice
public class BaseController extends ResponseEntityExceptionHandler {

	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<CustomMessage> handleEntityNotFound(EmptyResultDataAccessException ex){
		return new ResponseEntity<>(CustomMessage.RESOURCE_NOT_FOUND, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<CustomMessage> genericException(Exception ex){
		return new ResponseEntity<>(CustomMessage.RESOURCE_SERVER_ERROR, HttpStatus.BAD_REQUEST);
	}
	
	@Override
	public ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request){
		return new ResponseEntity<>(CustomMessage.RESOURCE_METHOD_NOT_SUPPORTED, HttpStatus.BAD_REQUEST);
	}
	
	
	
}

