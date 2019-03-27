package practice.DoIt.A09_3;

public abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	public void go(int level) {
		showLevelMessage();
		run();
		for(int i=0;i<level;i++) {
			jump();
		}
		turn();
		
	}
	
	
}
