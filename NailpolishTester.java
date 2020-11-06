package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class NailpolishTester {
	public static void main(String[] args) {
		
		Nailpolish lakme= new Nailpolish("Lakme","RED",200);
		Nailpolish nykaa= new Nailpolish("Nykaa","BLACK",100);
		Nailpolish colorbar= new Nailpolish("Colorbar","WHITE",180);
		Nailpolish maybelline= new Nailpolish("Maybellin","PINK",250);
		Nailpolish revlon= new Nailpolish("Revlon","BLUE",200);
		
		ArrayList<Nailpolish> nail= new ArrayList<Nailpolish>();
		nail.add(lakme);
		nail.add(nykaa);
		nail.add(colorbar);
		nail.add(maybelline);
		nail.add(revlon);
		
		System.out.println("****traverse using enhanced for loop****");
		for(Nailpolish ref:nail) {
			System.out.println(ref);
		}
		
		System.out.println("****traverse using iterator ****");
		
		Iterator<Nailpolish> itr =  nail.iterator();
		while(itr.hasNext()) {
			Nailpolish n = itr.next();
			System.out.println(n);
		}
		
		System.out.println("****traverse using list iterator****");
		
		ListIterator<Nailpolish> lstitr = nail.listIterator();
		while(lstitr.hasNext()) {
			Nailpolish n = lstitr.next();
			System.out.println(n);
		}
		System.out.println("using has previous list iterator");
		while(lstitr.hasPrevious()) {
			Nailpolish n = lstitr.previous();
			System.out.println(n);
		}


	}

}
