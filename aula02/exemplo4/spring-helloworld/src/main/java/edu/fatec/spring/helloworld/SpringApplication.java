package edu.fatec.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;


public class SpringApplication {


	public static void main(String ... args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		MessageBean bean = ctx.getBean("helloWorldBean", MessageBean.class);
		
		MessageBean beanWithArgs = ctx.getBean("helloWorldBeanWithArgs", MessageBean.class);
		
		MessageBean beanWithProperties = ctx.getBean("helloWorldBeanWithProperties", MessageBean.class);
		
		
		//Removes the bean definition, just to show the destroy method
		BeanDefinitionRegistry registry = (BeanDefinitionRegistry)ctx.getAutowireCapableBeanFactory();
		registry.removeBeanDefinition("messageFactory");
		
	}



}