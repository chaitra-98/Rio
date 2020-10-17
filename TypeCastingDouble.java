package WrapperClass;

public class TypeCastingDouble {
	public static void main(String[] args) {
		System.out.println("Start Program");
		double c=28.40;
		
		Double dou=new Double(c); //Boxing
		System.out.println("The value of d is " +dou);
		
		Double dVal=c;    //AutoBoxing
		System.out.println("The value of double is :" +dVal);
		
		double a=Double.valueOf(dou);    //UnBoxing
		System.out.println("The value of a :"+a);
		
		double k=dou;  //AutoUnBoxing
		System.out.println("The value of k :" +k);
		
		int b=(int)c;
		System.out.println("The value is " +b);  //narrowing
		
		System.out.println("End program");

	}

}
