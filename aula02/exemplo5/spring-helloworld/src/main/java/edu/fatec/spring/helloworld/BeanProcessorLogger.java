package edu.fatec.spring.helloworld;


import org.springframework.beans.factory.config.BeanPostProcessor;


public class BeanProcessorLogger implements BeanPostProcessor {
	
	
	public Object postProcessAfterInitialization(Object bean, String beanName){
		System.out.println("After Initialization bean " + beanName);
		return bean;
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName){
		System.out.println("Before Initialization bean " + beanName);
		return bean;
	}
	
	
	
} 