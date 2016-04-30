package edu.fatec.spring.helloworld;


public class MessageBean {

	private String message;
	private int id;
	private MessageHeader header;

	public MessageBean(){
	
	}

	public MessageBean(String message) {
		this.message = message;
	} 

	public MessageBean(String message, int id, MessageHeader header) {
		this.message = message;
		this.id = id;
		this.header = header;
	}

	public String getMessage(){
		return this.message;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}
	
	public void setHeader(MessageHeader header){
		this.header = header;
	}
	public MessageHeader getHeader(){
		return this.header;
	}
	
} 