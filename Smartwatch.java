package interfaceConcept;

public abstract class Smartwatch implements Watch {
	
	String color;
	int cost;
	String brand;
	
	public void alarm() {
		System.out.println("Alarm is present");
	}
	public void displaydate() {
		System.out.println("the smart watch displays date");
	}
	public void dilsplaydetails() {
		System.out.println("color: "+color+" cost: "+cost+" brand: "+brand+" ");
	}
	
	abstract public void appsnotification();
	abstract public void waterproof();

}
