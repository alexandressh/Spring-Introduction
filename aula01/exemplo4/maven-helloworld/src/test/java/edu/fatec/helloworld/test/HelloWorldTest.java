package edu.fatec.helloworld.test;

import org.junit.Test;
import org.junit.Assert;
import edu.fatec.helloworld.HelloWorldMaven;

public class HelloWorldTest {


	private String testArgs [] = {	"This", "is", "a", "Hello", "World", "!!!!"	}; 



	@Test
	public void testHelloWorldMsg(){
		
		
		HelloWorldMaven hello = new HelloWorldMaven();
		hello.main(testArgs);

	}
	
	@Test
	public void testMultiply(){
		
		int result = HelloWorldMaven.multiply(2, 2);
		
		Assert.assertTrue("The result does not match", result == 4);
		
	}




}