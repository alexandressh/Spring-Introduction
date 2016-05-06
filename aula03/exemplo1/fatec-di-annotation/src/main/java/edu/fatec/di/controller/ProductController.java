package edu.fatec.di.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.fatec.di.model.Product;
import edu.fatec.di.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;	
	
	@RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
	public ResponseEntity<List<Product>> all(Pageable pageable){
		return new  ResponseEntity<>(service.findAll(pageable).getContent(), HttpStatus.OK);
	}
	
	@RequestMapping(value = {"{id}", "/{id}"}, method = RequestMethod.GET)
	public ResponseEntity<Object> byId(@PathVariable Long id){
		
		Product product = service.findOne(id);
		if(product == null){
			return new  ResponseEntity<>(CustomMessage.RESOURCE_NOT_FOUND, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(service.findOne(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
	public ResponseEntity<Product> create(@Valid @RequestBody Product product){
		return new  ResponseEntity<>(service.save(product), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = {"{id}", "/{id}"}, method = RequestMethod.DELETE)
	public ResponseEntity<CustomMessage> delete(@PathVariable Long id){
		service.delete(id);
		return new  ResponseEntity<>(CustomMessage.RESOURCE_DELETED, HttpStatus.OK);
	}
}
