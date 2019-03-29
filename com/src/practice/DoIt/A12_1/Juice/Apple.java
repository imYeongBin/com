package practice.DoIt.A12_1.Juice;

public class Apple extends Material{
	@Override
	public void doMaking() {
		System.out.println("재료로 사과를 사용합니다.");
	}
	public String toString() {
		return "재료는 사과입니다.";
	}
}
