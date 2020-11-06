package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class BackcaseTester {

	public static void main(String[] args) {
		
		Backcase MI = new Backcase("phone","mi",400);
		Backcase HP = new Backcase("laptop","hp",5000);
		Backcase IPhone = new Backcase("phone","Apple",1000);
		
		ArrayList<Backcase> cover = new ArrayList<Backcase>();
		
		cover.add(MI);
		cover.add(HP);
		cover.add(IPhone);
		
		System.out.println("traverse using enhanced for loop");
		for(Backcase ref:cover) {
			System.out.println(ref);
		}
		System.out.println("traverse using iterator");
		Iterator<Backcase> itr =  cover.iterator();
		while(itr.hasNext()) {
			Backcase n = itr.next();
			System.out.println(n);
		}
System.out.println("****traverse using list iterator****");
		
		ListIterator<Backcase> lstitr = cover.listIterator();
		while(lstitr.hasNext()) {
			Backcase n = lstitr.next();
			System.out.println(n);
		}
		System.out.println("using has previous list iterator");
		while(lstitr.hasPrevious()) {
			Backcase n = lstitr.previous();
			System.out.println(n);
		}

		
		

		// TODO Auto-generated method stub

	}

}
