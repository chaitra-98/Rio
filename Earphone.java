package queue;

public class Earphone implements Comparable<Earphone> {
	String brand;
	int cost;
	boolean ifwired;
	String color;
	public Earphone(String brand, int cost, boolean ifwired, String color) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.ifwired = ifwired;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public boolean isIfwired() {
		return ifwired;
	}
	public void setIfwired(boolean ifwired) {
		this.ifwired = ifwired;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Earphone [brand=" + brand + ", cost=" + cost + ", ifwired=" + ifwired + ", color=" + color + "]";
	}
	@Override
	public int compareTo(Earphone o1) {
		return o1.getCost()-o1.getCost();
	}
	

}
