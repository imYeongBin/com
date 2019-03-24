package practice.interfaceEx;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass if1 = new InterfaceClass();
		if1.ex1method1();
		if1.ex2method1();
		System.out.println("if1 CONSTANT : "+if1.COST);
		System.out.println("if1 CEHCK : "+if1.CHECK);
		System.out.println("===================================");
		InterfaceEx1 if2 = new InterfaceClass();
		if2.ex1method1();
		System.out.println("if2 CONSTANT : "+if2.COST );
		System.out.println("===================================");
		InterfaceEx2 if3 = new InterfaceClass();
		if3.ex2method1();
		System.out.println("if3 CHECK : "+if3.CHECK);		
	}
}
