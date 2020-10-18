package interfaceConcept;

public class Watchtester {
	
	public static void main(String args[]) {
		
		Analogwatch watch = new Analogwatch();
		System.out.println("analog watch details");
		watch.cost=5000;
		watch.name="sonata";
		watch.displaydetails();
		watch.appsnotification();
		watch.displaydate();
		watch.alarm();
		watch.waterproof();
		System.out.println("=============================");
		Smartwatch smart = new Analogwatch();
		System.out.println("smartwatch details");
		smart.brand="mi";
		smart.color="grey";
		smart.cost=25000;
		smart.dilsplaydetails();
		smart.appsnotification();
		smart.displaydate();
		
		
		
	}

}
