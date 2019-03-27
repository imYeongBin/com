package practice.DoIt.A09_3_TDD;

public class BeginnerLevel extends PlayerLevel{
	
	@Override
	public void run() {
		System.out.println("Beginner can run slowly");
	}
	
	@Override
	public void jump() {
		System.out.println("Beginner can not jump");
	}
	
	@Override
	public void turn() {
		System.out.println("Beginner can not turn");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("I'm Beginner");
	}
	

}
