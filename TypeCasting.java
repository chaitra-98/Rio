package WrapperClass;

public class TypeCasting {
	public static void main(String[] args) {
		System.out.println("Start Program");
		char c='S';
		
		Character cha=new Character(c); //Boxing
		System.out.println("The value of ch is " +cha);
		
		Character charVal=c;    //AutoBoxing
		System.out.println("The value of character is :" +charVal);
		
		char a=Character.valueOf(cha);    //Unboxing
		System.out.println("The value of a :"+a);
		
		char k=cha;  //Autounboxing
		System.out.println("The value of k :" +k);
		
		int b=(int)c;
		System.out.println("The value is " +b);//narrowing
		
		int x=cha+26;
		cha=(char)a;System.out.println(c);
		
		System.out.println("End program");
		

}
}
