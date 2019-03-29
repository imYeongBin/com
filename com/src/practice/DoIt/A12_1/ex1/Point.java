package practice.DoIt.A12_1.ex1;

public class Point<T,V> {
	T x;
	V y;
	
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
}
