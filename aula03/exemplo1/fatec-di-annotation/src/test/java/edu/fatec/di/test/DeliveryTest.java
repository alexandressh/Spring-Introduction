package edu.fatec.di.test;

import org.junit.Test;
import org.springframework.util.Assert;

import edu.fatec.di.model.Delivery;
import edu.fatec.di.model.Product;
import edu.fatec.di.services.calculation.CalculationUtils;

public class DeliveryTest {

	
	@Test
	public void testDeliveryCalculation(){
		Product product = new Product();
		product.setId(100L);
		product.setDescription("Test product");
		product.setValue(12002D);
		
		Delivery delivery = new Delivery();
		delivery.setProductId(100L);
		delivery.setValue(100D);
		
		Assert.isTrue(CalculationUtils.getCalculation(product, delivery).getValue() == 1218.00, "Calculation value does not match");
		
	}
}
