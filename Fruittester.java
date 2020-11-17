package set;

import java.util.Comparator;
import java.util.TreeSet;

import java.util.Iterator;

public class Fruittester {

	public static void main(String[] args) {
		
		Comparator<Fruits> obj = (o1,o2)-> o1.getName().compareTo(o2.getName());

		Fruits apple = new Fruits("Apple",200,true);
		Fruits orange = new Fruits("Orange",100,false);
		Fruits banana = new Fruits("Banana",60,true);
		Fruits grape = new Fruits("Grape",150,false);
		
		TreeSet<Fruits> ref = new TreeSet<Fruits>(obj);
		ref.add(apple);
		ref.add(orange);
		ref.add(banana);
		ref.add(grape);
		System.out.println(ref);
		
		System.out.println("Traversing using iterator");
		Iterator<Fruits> itr = ref.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Using Floor method : " + ref.floor(apple));
		System.out.println("Using Ceiling method : " + ref.ceiling(grape));
		System.out.println("Using first method : " + ref.first());
		System.out.println("Using last method : " + ref.last());
		System.out.println("Using poll first method : " + ref.pollFirst());
		System.out.println("Using poll last method : " + ref.pollLast());
		System.out.println(ref);
		
		//Comparator<Fruits> sort = (o1,o2)-> o1.getName().compareTo(o2.getName());


		


		// TODO Auto-generated method stub

	}

}
