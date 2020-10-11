package xworkz.arrayassignment1;

public class TrywithFinally {
	public static int method() {
		try{
			System.out.println("Try block ");
			return 10;
		}
		finally {
			System.out.println("Finally block executed ");
		}
	}

	public static void main(String[] args) {
		System.out.println(method());
		
		// TODO Auto-generated method stub

	}

}
