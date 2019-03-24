package practice.CallByValue;

public class CallByReference {
	
	static class Ex{
		int a;
		int b;
	}	
	public static void add(Ex test) {
		test.a+=5;
		test.b+=10;
	}	
	public static void main(String[] args) {
		Ex test = new Ex();
		test.a = 5;
		test.b = 10;
		System.out.println("a : "+test.a+", b : "+test.b);
		add(test);
		System.out.println("a : "+test.a+", b : "+test.b);		
	}
}
