package edu.fatec.di.model;

public class Delivery {
	
	private Long productId;
	
	private String cep;
	
	private Double value;
	
	public Delivery (){
		
	}
	
	public Delivery(Long productId, String cep, Double value){
		this(productId);
		this.cep = cep;
		this.value = value;
	}
	
	public Delivery(Long productId){
		this.productId = productId;
	}
	
	public Long getProductId() {
		return productId;
	}
	
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
