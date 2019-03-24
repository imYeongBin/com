package practice.interfaceEx2;

public class Priest implements Staff{
	
	public Priest() {
		System.out.println("Priest입니다.");
		equipStaff();
	}
	
	@Override
	public void equipStaff() {
		System.out.println("staff 장착");
	}

}
