public class HelloWorld{

	interface WorldSpeaker{
		void helloWorld();
	}

	

	public static void main(String ... args) {
		
		WorldSpeaker speak = () -> System.out.println("Hello world!");
		speak.helloWorld();
		

	}
	
}