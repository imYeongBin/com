package practice.DoIt.A06_2;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentJames = new Student("James",5000);
		Student studentTomas = new Student("Tomas",10000);
		Student studentEdward = new Student("Edward",15000);
		
		Bus bus100 = new Bus(100);
		Subway subwayGreen = new Subway("2호선");
		Taxi taxi1111 = new Taxi(1111);
		
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		studentEdward.takeTaxi(taxi1111);
		studentEdward.showInfo();
		taxi1111.showInfo();
	}

}
