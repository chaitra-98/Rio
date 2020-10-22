package xworkz.multipleinheritance;

public class Phonetester {

	public static void main(String[] args) {
		
		Phone phone = new Smartphone();
		phone.camera();
		phone.dualsim();
		
		Applephone apple= new Smartphone();
		apple.batterylife();
		apple.dualsim();
		
		Smartphone smartphone = new Smartphone();
		smartphone.batterylife();
		smartphone.camera();
		smartphone.dualsim();
		
		
		
		// TODO Auto-generated method stub

	}

}
