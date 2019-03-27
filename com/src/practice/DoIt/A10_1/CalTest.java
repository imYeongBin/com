package practice.DoIt.A10_1;

public class CalTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		Cal2 cal = new Cal2();
		System.out.println(cal.add(num1, num2));
		System.out.println(cal.sub(num1, num2));
		System.out.println(cal.times(num1, num2));
		System.out.println(cal.div(num1, num2));
		cal.showInfo();
		
	}
}
