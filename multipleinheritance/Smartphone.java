package xworkz.multipleinheritance;

public class Smartphone implements Phone,Applephone {
	
	@Override
	public void camera() {
		System.out.println("good clarity camera");
	}
	@Override
	public void dualsim() {
		System.out.println("smartphone contains dualsim capacity");
		
	}
	@Override
	public void batterylife() {
		System.out.println("Applephone has good battery life");
	}


}
