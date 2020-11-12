package queue;

import java.util.PriorityQueue;

public class PQueuedouble {

	public static void main(String[] args) {
		PriorityQueue<Double> ref = new PriorityQueue<Double>();
		ref.add(5.2);
		ref.add(6.2);
		ref.add(7.4);
		ref.add(8.2);
		ref.add(5.6);
		System.out.println(ref);
		
		for(Double pq:ref) {
			System.out.println(pq);
		}
		
		System.out.println("First element : " + ref.peek() );
		System.out.println("Remove element : " + ref.poll());
		ref.element();
		System.out.println(" element method : " + ref);
		System.out.println(" offer Method : " + ref.offer(5.8));
		System.out.println(ref);

		
		// TODO Auto-generated method stub

	}

}
