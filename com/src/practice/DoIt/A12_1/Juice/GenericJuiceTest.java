package practice.DoIt.A12_1.Juice;

public class GenericJuiceTest {
	public static void main(String[] args) {
		
		GenericJuice<Apple> appleJuice = new GenericJuice<Apple>();
		appleJuice.setMaterial(new Apple());
		Apple apple2 = appleJuice.getMaterial(); //제네릭은 형변환을 할 필요가 없다.
		appleJuice.making();
		
		GenericJuice<Orange> orangeJuice = new GenericJuice<Orange>();
		orangeJuice.setMaterial(new Orange());
		Orange orange2 = orangeJuice.getMaterial();
		orangeJuice.making();
		
	}
}
