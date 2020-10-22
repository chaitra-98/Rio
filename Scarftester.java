package xworkz.thiskeyword;

public class Scarftester {

	public static void main(String[] args) {
		System.out.println("start  of the program");
		System.out.println("the details of cotton scarf");
		Scarf scarf= new Scarf("blue",1000,55f);
		System.out.println("the color of scarf is :"+scarf.color);
		System.out.println("the cost of the scarf is :"+scarf.cost);
		System.out.println("the length of the scarf is :"+scarf.length);
		System.out.println("=========================");
		Scarf woolen = new Scarf("black",1200,82f);
		System.out.println("details of woolen scarf");
		System.out.println("the color of scarf is :"+woolen.color);
		System.out.println("the cost of the scarf is :"+woolen.cost);
		System.out.println("the length of the scarf is :"+woolen.length);
		
		
		System.out.println("The end of the program");
		
		// TODO Auto-generated method stub

	}

}
