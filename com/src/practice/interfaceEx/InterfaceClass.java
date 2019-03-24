package practice.interfaceEx;

public class InterfaceClass implements InterfaceEx1, InterfaceEx2{

	@Override
	public void ex1method1() {
		System.out.println("InterfaceEx1 구현");
	
	}	
	@Override
	public void ex2method1() {
		System.out.println("InterfaceEx2 구현");
	}

	
}
