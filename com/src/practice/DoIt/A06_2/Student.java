package practice.DoIt.A06_2;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	void takeBus(Bus bus) {
		bus.take(1000);//버스비용은 1000원. 버스입장에서는 수익
		this.money -=1000;		
	}
	
	void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -=1500;
	}
	
	void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money-=10000;		
	}
	
	public void showInfo() {
		System.out.println(studentName+"학생의 남은 돈은 "+money+"입니다/.");
		
	}
}
