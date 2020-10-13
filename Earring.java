package methodoverriding;

public class Earring extends Jewellery {
	public int getCost() {
		cost= 22000;
		System.out.println("cost :"+cost);
		return cost;
	}
	@Override
	void type() {
		System.out.println("the tpe of jewellery is SILVER");
	}
	public static void main(String[]args) {
		Earring obj = new Earring();
		obj.getColor();
		obj.getCost();
		obj.type();
		obj.isIfgold();
		obj.Displaydetails();
	}

}
