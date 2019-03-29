package practice.DoIt.A12_1.Juice;

public class GenericJuice<T extends Material> {
	private T material;	//
	
	public void setMaterial(T material) {
		this.material = material;
	}
		
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void making() {
		material.doMaking();
	}
}
