package edu.fatec.helloworld;





public class HelloWorldMaven {

	interface Speaker{

		String say();
	}

	public static int multiply(int a, int b){
		return a * b;
	}
	
	
	public static void main(String ...args) {


		Speaker speak = () -> {
			return "Hello, world!!";
		};
		

		String message = speak.say();
		
		System.out.println(message);

		StringBuilder tabs = new StringBuilder();

		for(int i = 0; i < args.length;i++){
			tabs.append("\t");
			System.out.println(tabs.toString() + args[i]);
		}
	

	} 


}