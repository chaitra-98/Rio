package arraylistsorting;

import java.util.ArrayList;

public class Eyelinertester {

	public static void main(String[] args) {
		Eyeliner first = new Eyeliner("blue","mac",250,4.0);
		Eyeliner second = new Eyeliner("black","nykaa",380,4.6);
		Eyeliner third = new Eyeliner("glitter","sugar",450,5.0);
		Eyeliner fourth = new Eyeliner("green","myglamm",265,3.8);
		
		ArrayList<Eyeliner> liner = new ArrayList<Eyeliner>();
		liner.add(first);
		liner.add(second);
		liner.add(third);
		liner.add(fourth);
		System.out.println(liner);
		
		System.out.println("traversing using enhanced for loop");
		for(Eyeliner ref :liner) {
			System.out.println(ref);
		}
		System.out.println("displying last elementL: "+liner.get(liner.size()-1));
		
		System.out.println("updating 3rd element");
		Eyeliner fifth= new Eyeliner("pink","ellie",300,5.0);
		System.out.println(liner.set(2,fifth));
		System.out.println(liner);
		System.out.println("updating 0 index");
		Eyeliner sixth= new Eyeliner("gold","sugar",400,5.0);
		System.out.println(liner.set(0,sixth));
		System.out.println(liner);
		
	}

}
