package edu.fatec.di.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fatec.di.model.Delivery;
import edu.fatec.di.model.Product;
import edu.fatec.di.services.calculation.CalculationUtils;

@Service
public class DeliveryServiceImpl implements DeliveryService{

	@Autowired
	private ProductService service;
	
	
	@Override
	public Delivery calculate(Delivery delivery) throws BusinessException{
		Product product = service.findOne(delivery.getProductId());
		if(product == null){
			throw new BusinessException("The product was not found");
		}
		return CalculationUtils.getCalculation(product, delivery);
	}
	
	
	
	
	
	
}
