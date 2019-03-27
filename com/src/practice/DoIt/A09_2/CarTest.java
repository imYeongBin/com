package practice.DoIt.A09_2;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new AICar();
		Car yourCar = new ManualCar();
		myCar.run();
		yourCar.run();
		
	}
}
