package practice.DoIt.A09_3;

public class PlayerTest {
	public static void main(String[] args) {
		Player player = new Player();
		PlayerLevel aLevel = new AdvancedLevel();
		PlayerLevel sLevel = new SuperLevel();
		
		player.play(1);
		
		player.UpgradeLevel(aLevel);
		player.play(3);
		
		player.UpgradeLevel(sLevel);
		player.play(5);
	}
}
