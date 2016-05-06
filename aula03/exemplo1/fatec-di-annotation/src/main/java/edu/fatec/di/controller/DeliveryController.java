package edu.fatec.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.fatec.di.model.Delivery;
import edu.fatec.di.services.BusinessException;
import edu.fatec.di.services.DeliveryService;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

	@Autowired
	private DeliveryService deliverySvc;
	
	
	
	@RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
	public ResponseEntity<Delivery> calculate(@RequestBody Delivery delivery) throws BusinessException{
		return new ResponseEntity<>(deliverySvc.calculate(delivery), HttpStatus.OK);
	}
	
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<CustomMessage> genericException(BusinessException ex){
		System.out.println(ex.getMessage());
		return new ResponseEntity<>(new CustomMessage(404, "Invalid entity: " + ex.getMessage()), HttpStatus.BAD_REQUEST);
	}
	
	
	
	
}
