package edu.fatec.spring.helloworld;


import org.springframework.beans.factory.InitializingBean;

public class MessageHeader implements InitializingBean {
	
	private String headerName;
	private String content;
	
	private static int id;
	
	
	
	public void setHeaderName(String headerName){
		this.headerName = headerName;
	}
	
	public String getHeaderName(){
		return this.headerName;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	public String getContent(){
		return this.content;
	}
	
	@Override
	public void afterPropertiesSet(){
		System.out.println("Creating bean with id [ " + ++id + " ] : Content: [ headerName: " +  headerName + " , content: " + content +  " ]");
	}
	
	
}