package set;

public class Fruits {
	String name;
	int cost;
	boolean isripe;
	public Fruits(String name, int cost, boolean isripe) {
		super();
		this.name = name;
		this.cost = cost;
		this.isripe = isripe;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public boolean isIsripe() {
		return isripe;
	}
	public void setIsripe(boolean isripe) {
		this.isripe = isripe;
	}
	@Override
	public String toString() {
		return "Fruits [name=" + name + ", cost=" + cost + ", isripe=" + isripe + "]";
	}
	

}
