package week05;

public class SpacedLogger implements Logger {
	String something;
	
	//constructor
	SpacedLogger(String something){
		this.something = something;
	}
	
	@Override
	public void Log() {
		for(int i=0; i<something.length(); i++) {
		System.out.print(something.charAt(i)+ " ");
		}
	}
	
	@Override
	public void Error() {
		System.out.print("ERROR: ");
		for(int i=0; i<something.length(); i++) {
		System.out.print(something.charAt(i)+ " ");
		}
	}

}
