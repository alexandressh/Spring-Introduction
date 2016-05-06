package edu.fatec.di.controller;

public class CustomMessage {

	private int code;
	
	private String message;
	
	public static CustomMessage RESOURCE_NOT_FOUND = new CustomMessage (404, "The resource was not found");
	
	public static CustomMessage RESOURCE_DELETED = new CustomMessage (200, "The resource was deleted");
	
	public static CustomMessage RESOURCE_SERVER_ERROR = new CustomMessage (500, "Generic error while processing the request");
	
	public static CustomMessage RESOURCE_METHOD_NOT_SUPPORTED = new CustomMessage (500, "Method not supported!");
	
	public CustomMessage () {
		
	}
	
	public CustomMessage(int code, String message){
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
