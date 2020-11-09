package arraylistsorting;

public class Eyeliner {
	String color;
	String brand;
	int cost;
	double rating;
	public Eyeliner(String color, String brand, int cost, double rating) {
		super();
		this.color = color;
		this.brand = brand;
		this.cost = cost;
		this.rating = rating;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
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
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Eyeliner [color=" + color + ", brand=" + brand + ", cost=" + cost + ", rating=" + rating + "]";
	}
	
	
}