package functionalinterface;

public class NoArgumentTester {

	public static void main(String[] args) {
		
		
		NoArgumentFI noargument1=()->{
			String str="Hello World";
			System.out.println("the message is :"+str);
			return str;
			
		};
		
		
		
		noargument1.printHello();
		// TODO Auto-generated method stub

	}

}
