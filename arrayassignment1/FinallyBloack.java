package xworkz.arrayassignment1;

public class FinallyBloack {

	public static void main(String[] args) {
		try {
			int dividebyzero = 25/0;
			System.out.println(dividebyzero);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block executed");
		}
		
		// TODO Auto-generated method stub

	}

}
