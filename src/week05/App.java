package week05;

public class App {

	public static void main(String[] args) {
		AsteriskLogger asteriskLogger = new AsteriskLogger("Favorite");
		SpacedLogger spacedLogger = new SpacedLogger("Museum");
		
		asteriskLogger.Log();
		System.out.println("\n");
		asteriskLogger.Error();
		System.out.println("\n");
		
		System.out.println("---> TESTING OTHER CLASS METHOD <--- \n");
		spacedLogger.Log();
		System.out.println("\n");
		spacedLogger.Error();
		

	}

}
