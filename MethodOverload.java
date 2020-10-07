package methodoverloading;

public class MethodOverload {
	public int subtraction(int a,int b) {
	int sub=a-b;
	return sub;
	}
	
	public double subtraction(double a,double b) {
		double sub =a-b;
		return sub;
		
	}
	public int subtraction(int a,int b,int c) {
		int sub = b-c-a;
		return sub;
	}
	

}
