package arraylistsorting;

import java.util.ArrayList;
import java.util.Collections;

public class Countrytester  {

	public static void main(String[] args) {
		Country c1= new Country(28,"India",91);
		Country c2= new Country(9,"Korea",82);
		Country c3= new Country(50,"America",1);
		Country c4= new Country(0,"Japan",81);
		Country c5= new Country(4,"Singapore",65);


		
		ArrayList<Country> detail= new ArrayList<Country>();
		detail.add(c1);
		detail.add(c2);
		detail.add(c3);
		detail.add(c4);
		detail.add(c5);
		
		System.out.println(detail);
		System.out.println("foreach loop");
		for(Country c: detail) {
			System.out.println(c);
		}
		System.out.println("ASCENDING ORDER");
		Collections.sort(detail);
		System.out.println(detail);
		
		System.out.println("DESCENDING ORDER");
		Collections.reverse(detail);
		System.out.println(detail);

		
		// TODO Auto-generated method stub

	}

}
