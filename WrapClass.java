package WrapperClass;

public class WrapClass {
	public static void main(String[] args) {
		int i=50;
		byte b=70;
				
		int sum=i+b;     //cannot convert from long to int
		System.out.println("sum=" +sum);
		
		
		float a=5.23f;
		Float f=new Float(a);
		int c=(int) a/2;
		System.out.println(c);  // output=4
		

	}

}
