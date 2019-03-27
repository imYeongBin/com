package practice.DoIt.A09_3_TDD;


public class PlayerTest {
	public static void main(String[] args) {
		Player player = new Player();
		AdvancedLevel aLevel = new AdvancedLevel();
		SuperLevel sLevel = new SuperLevel();
		
		player.play(1);
		
		player.upgradeLevel(aLevel);
		player.play(3);
		
		player.upgradeLevel(sLevel);
		player.play(5);
		
	}
}
