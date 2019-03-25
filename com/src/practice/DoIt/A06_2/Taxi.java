package practice.DoIt.A06_2;

public class Taxi {
	public int taxiNumber;
	public int money;
	public int passengerCount;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money+=money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(taxiNumber+"번 택시에 현재 승객 "+passengerCount+"명 탑승중이고 수익은 "+money+"원입니다.");
	}
}
