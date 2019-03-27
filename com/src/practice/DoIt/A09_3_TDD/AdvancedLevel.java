package practice.DoIt.A09_3_TDD;

public class AdvancedLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("Advanced Level runs fast");
	}
	
	@Override
	public void jump() {
		System.out.println("Advanced Level can jump high");
	}
	
	@Override 
	public void turn() {
		System.out.println("Advanced Level can turn fast");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("I'm Advanced Level!!");
	}
}
