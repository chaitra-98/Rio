package collection;

public class Backcase {
	String type;
	String brand;
	int cost;
	public Backcase(String type, String brand, int cost) {
		super();
		this.type = type;
		this.brand = brand;
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	@Override
	public String toString() {
		return "Backcase [type=" + type + ", brand=" + brand + ", cost=" + cost + "]";
	}
	
	

}
