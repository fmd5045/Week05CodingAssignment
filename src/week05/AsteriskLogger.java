package week05;

public class AsteriskLogger implements Logger{
	String something;
	String somethingElse;
	
	//constructor
	AsteriskLogger(String something){
		this.something = something;
	}
	
	@Override
	public void Log() {
		for(int i=0; i<3; i++) {
		System.out.println("***"+something+"***");
		}
	}
	
	@Override
	public void Error() {
		System.out.println("*****************");
		System.out.println(("***ERROR: "+somethingElse+"***"));
		System.out.println("*****************");
		
	}
	
	
}
