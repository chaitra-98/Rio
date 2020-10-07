package methodoverloading;

public class MethodOverloadTester {
	public static void main (String[] args) {
		
		MethodOverload sub = new MethodOverload();
		int intresult = sub.subtraction(10, 5);
		System.out.println("the subtraction of 10.0 from 5.0 is: "+ intresult);
		
		double result = sub.subtraction(10.0, 5.0);
		System.out.println("the subtraction of 10 from 5 is: "+ result);		
		
		int result1 = sub.subtraction(10,15,5);
		System.out.println("the subtraction of 15 , 10 ,5  is: "+ result1);	
		
		
		 sub.subtraction(80.0, 52.0);
	}

}
