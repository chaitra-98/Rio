package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Earphonetester {

	public static void main(String[] args) {
		Earphone e1=new Earphone("mi",1000,false,"black");
		Earphone e2=new Earphone("apple",6000,true,"white");
		Earphone e3=new Earphone("levelu",2500,true,"blue");
		Earphone e4=new Earphone("boat",1500,false,"red");
		
		PriorityQueue<Earphone> ref = new PriorityQueue<Earphone>();
		ref.add(e1);
		ref.add(e2);
		ref.add(e3);
		ref.add(e4);
		System.out.println(ref);
		
		for(Earphone ep:ref) {
			System.out.println(ep);
		}
		System.out.println("iterator");
		Iterator<Earphone> ep = ref.iterator();
		while(ep.hasNext()) {
			System.out.println(ep.next());
		}

		System.out.println("First element : " + ref.peek() );
		System.out.println("Remove element : " + ref.poll());
		System.out.println(ref);
		ref.element();
		System.out.println("After element-method : " + ref);
		System.out.println("Using offer-Method : " + ref.offer(e3));
		System.out.println(ref);

		



		// TODO Auto-generated method stub

	}

}
