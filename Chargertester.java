package annonymousclass;

public class Chargertester {

	public static void main(String[] args) {
		
		Phonecharger phonecharger = new Phonecharger() {
			public void charging() {
				System.out.println("the phone charger is used to charge the phone");
				
			}
			 public void transferfiles() {
				 System.out.println("the phone chargers USB cabel is also used for transfering files");
			 }
		};
		phonecharger.charging();
		phonecharger.transferfiles();
		// TODO Auto-generated method stub

	}

}
