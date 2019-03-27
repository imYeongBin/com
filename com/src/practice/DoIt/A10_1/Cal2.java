package practice.DoIt.A10_1;

public class Cal2 extends Cal1{
	
	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	};
	
	@Override
	public int div(int num1, int num2) {
		if(num2!=0) {
			return num1/num2;
		}else {
			return Calculator.ERROR;
		}
		
	};
	public void showInfo() {
		System.out.println("Interface complete");
	}
	
}
