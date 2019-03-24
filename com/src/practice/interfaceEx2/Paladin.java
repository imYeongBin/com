package practice.interfaceEx2;

public class Paladin implements Armor{

	public Paladin() {
		System.out.println("팔라딘입니다.");
		equipArmor();
	}
	@Override
	public void equipArmor() {
		// TODO Auto-generated method stub
		System.out.println("아머 장착");
	}





}
