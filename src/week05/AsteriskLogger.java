package week05;

public class AsteriskLogger implements Logger{
	String something;
	
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
		for(int i = 0; i<something.length()+14; i++) {
		System.out.print("*");
		}
		System.out.print("\n");
		System.out.println(("*** ERROR:"+something+" ***"));
		for(int i = 0; i<something.length()+14; i++) {
		System.out.print("*");
		}
		
	}
	
	
}
