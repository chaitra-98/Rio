package interfaceConcept;

public class Analogwatch extends Smartwatch{
	
	int cost;
	String name;
	
	@Override
	public void appsnotification() {
		System.out.println("analogwatch does not give notification");
	}
	public void waterproof() {
		System.out.println("The watch is not waterproof");
	}
	public void alarm() {
		System.out.println("the alarm is absent");
	}
	public void displaydate() {
		System.out.println("yes it displays date");
	}
	
	public void displaydetails() {
		System.out.println("cost : "+cost+" name :"+name+" ");
	}

}
