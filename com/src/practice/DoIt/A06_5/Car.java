package practice.DoIt.A06_5;

public class Car {
	private static int serialNum = 10000;
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum=serialNum;		
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	public void setCarNum(int number) {
		carNum = number;
	}
	
}
