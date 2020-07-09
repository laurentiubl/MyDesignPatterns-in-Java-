package DependencyInjection;

public class Main {
	public static void main(String[] args) {
		
		
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages("Lalala", "ada@yqhoo.com");
	}
}
