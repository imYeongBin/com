package practice.DoIt.A09_3_TDD;

public class SuperLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("SuperLevel runs fast");
	}
	
	@Override 
	public void jump() {
		System.out.println("SuperLevel can jump high");
	}
	
	@Override 
	public void turn() {
		System.out.println("SuperLevel can turn fast");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("I'm SuperLevel user");
	}
}
