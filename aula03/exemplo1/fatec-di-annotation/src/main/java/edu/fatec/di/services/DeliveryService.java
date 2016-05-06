package edu.fatec.di.services;

import edu.fatec.di.model.Delivery;

public interface DeliveryService {
	
	Delivery calculate(Delivery delivery) throws BusinessException;
	
}
