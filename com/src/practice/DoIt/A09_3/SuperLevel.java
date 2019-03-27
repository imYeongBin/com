package practice.DoIt.A09_3;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("SuperLevel runs so fast");
	}
	
	@Override
	public void jump() {
		System.out.println("SuperLevel can jump high");
	}
	
	@Override
	public void turn() {
		System.out.println("SuperLevel can turn");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("I'm a SuperLevel User!!!");
	}
}
