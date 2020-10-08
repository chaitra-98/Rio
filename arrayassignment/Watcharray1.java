package xworkz.arrayassignment;

public class Watcharray1 {
	String brand;
	int cost;
	String dell;
	
	Watcharray1(String inbrand,String indell,int incost){
		brand=inbrand;
		dell=indell;
		cost=incost;
	}
	
	
	
	
	public void details() {
		System.out.println("brand :" +brand+" cost: "+cost+" dell :"+dell+" ");
	}
	
	
	public void function() {
		System.out.println("The watch is running ");
		
	}

}
