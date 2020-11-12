package linkedlist;

public class Flowers {
	String color;
	int cost;
	String name;
	public Flowers(String color, int cost, String name) {
		super();
		this.color = color;
		this.cost = cost;
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Flowers [color=" + color + ", cost=" + cost + ", name=" + name + "]";
	}
	

}
