package practice.DoIt.A09_2;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("start Car");
	};
	public void turnOff() {
		System.out.println("turn Off the car");
	};
	
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	};
	
}
