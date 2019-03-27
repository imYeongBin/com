package practice.DoIt.A10_1;

public abstract class Cal1 implements Calculator{

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}
	@Override
	public int sub(int num1, int num2) {
		return num1-num2;
	};
}
