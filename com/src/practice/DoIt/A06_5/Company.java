package practice.DoIt.A06_5;

public class Company {
	private static Company instance = new Company(); 
	private Company() {}
	public static Company getInstance() { //인스턴스를 반환하는 메서드는 반드시 static으로 선언해야함.
		if(instance==null) {			//getInstance()메서드는 인스턴스 생성과 상관없이 호출할 수 있어야 하기 때문에
			instance = new Company();
		}
		return instance;
	}
}





