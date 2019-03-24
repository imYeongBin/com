package practice.interfaceEx2;

public class Knight implements Armor, Weapon{ 
	public Knight() {
		System.out.println("knight입니다.");
		equipArmor();
		equipWeapon();
	}
	
	@Override
	public void equipArmor() {
		System.out.println("아머 장착");
	}
	@Override
	public void equipWeapon() {
		System.out.println("Weapon 장착");
	}
}
