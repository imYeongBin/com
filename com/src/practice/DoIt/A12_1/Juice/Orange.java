package practice.DoIt.A12_1.Juice;

public class Orange extends Material{
	@Override
	public void doMaking() {
		System.out.println("오렌지를 재료로 사용합니다.");
	}
	public String toString() {
		return "재료는 오렌지입니다.";
	}
}
