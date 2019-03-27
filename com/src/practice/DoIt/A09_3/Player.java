package practice.DoIt.A09_3;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	public void UpgradeLevel(PlayerLevel PlayerLevel) {
		this.level = PlayerLevel;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
