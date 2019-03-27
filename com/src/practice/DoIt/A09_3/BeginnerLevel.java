package practice.DoIt.A09_3;

public class BeginnerLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("Beginner run slowly");
	}

	@Override
	public void jump() {
		System.out.println("Beginner cannot jump!");
	}
	
	@Override
	public void turn() {
		System.out.println("Beginner cannot trun!");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("I'm a Beginner!!!");
	}
}
