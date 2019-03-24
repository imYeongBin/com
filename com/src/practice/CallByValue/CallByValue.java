package practice.CallByValue;

public class CallByValue {
	
	public static void add(int a, int b) {
		a+=5;
		b+=10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b=10;
		System.out.println("a : "+a+", b : "+b);
		add(a,b);
		System.out.println("a : "+a+", b : "+b);
		
	}

}
