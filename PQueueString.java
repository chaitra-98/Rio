package queue;

import java.util.PriorityQueue;

public class PQueueString {
public static void main(String[] args) {
		
		PriorityQueue<String> ref = new PriorityQueue<String>();
		ref.add("red");
		ref.add("green");
		ref.add("blue");
		ref.add("black");
		ref.add("white");
		System.out.println(ref);
		
		for (String Str : ref) {
			System.out.println(Str);
		}
		
		System.out.println("First element : " + ref.peek() );
		System.out.println("Remove element : " + ref.poll());
		ref.element();
		System.out.println(" element method : " + ref);
		System.out.println(" offer Method : " + ref.offer("white"));
		System.out.println(ref);
	}


}
