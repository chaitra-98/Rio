package methodoverriding;

public class Jewellery {
	String color;
	int cost;
	boolean ifgold;
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
	public boolean isIfgold(){
		return ifgold;
	}
	public void setIfgold(boolean ifgold) {
		this.ifgold = ifgold;
	}
	void type() {
		System.out.println("the tpe of jewellery is gold");
	}
	void Displaydetails() {
		System.out.println("color : "+color+" cost :"+cost+" ifgold : "+ifgold+" ");
	}

}
