package collection;

public class Frame {
	boolean ifchangebale;
	String material;
	double size;
	public Frame(boolean ifchangebale, String material, double size) {
		//super();
		this.ifchangebale = ifchangebale;
		this.material = material;
		this.size = size;
	}
	public boolean isIfchangebale() {
		return ifchangebale;
	}
	public void setIfchangebale(boolean ifchangebale) {
		this.ifchangebale = ifchangebale;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Frame [ifchangebale=" + ifchangebale + ", material=" + material + ", size=" + size + "]";
	}
	}
