package practice.DoIt.A09_3_TDD;

public class Player{
	private PlayerLevel level;
	
	public Player() {//default construct
		level = new BeginnerLevel();
	}
	public void upgradeLevel(PlayerLevel playerLevel) {
		this.level = playerLevel;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
