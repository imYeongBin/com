package practice.DoIt.A09_3;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("Advanced Level run fast");
	}
	
	@Override
	public void jump() {
		System.out.println("Advanced Level can jump");
	}
	
	@Override
	public void turn() {
		System.out.println("Advanced Level can turn");
	}
	
	@Override 
	public void showLevelMessage() {
		System.out.println("I'm an Advanced!!!");
		
	}
	
}
