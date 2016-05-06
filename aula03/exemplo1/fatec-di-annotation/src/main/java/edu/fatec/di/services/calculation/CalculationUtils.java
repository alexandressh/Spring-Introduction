package edu.fatec.di.services.calculation;

import java.util.HashMap;

import edu.fatec.di.model.Delivery;
import edu.fatec.di.model.Product;

public class CalculationUtils {

	private static HashMap<Double, Double> multipliers = new HashMap<>();
	
	private static double PRODUCT_PERCENT_VAL = 0.5;
	
	static {
		multipliers.put(100D, 5.0);
		multipliers.put(200D, 2.0);
		multipliers.put(1200D, 3.0);
		multipliers.put(3000D, 1.0);
	}
	
	
	
	public static Delivery getCalculation(Product product, Delivery delivery){
		
		Double multiplier = multipliers.get(product.getValue());
		
		multiplier = (multiplier == null) ? 0 : multiplier;
		
		double value = product.getValue() + (product.getValue() / 100 * PRODUCT_PERCENT_VAL * multiplier);
		
		return new Delivery(product.getId(), delivery.getCep(), value);
	}
}
