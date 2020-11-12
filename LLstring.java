package linkedlist;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LLstring {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		System.out.println("adding elements to the list with different methods");
		System.out.println(names.add("chaitra"));
		names.offer("arun");
		names.add(2, "sindhu");

		names.addFirst("nagu");
		
		names.addLast("srinivas");
		names.offerFirst("vedha");
		names.offerLast("nayana");
		System.out.println(names);
		System.out.println("-----Iterator-----");
		Iterator<String> ref=names.iterator();
         while(ref.hasNext()) {
        	 System.out.println(ref.next());
         }
        System.out.println("-----List Iterator-----"); 
         ListIterator<String> ref1=names.listIterator();
         while(ref1.hasNext()) {
        	 System.out.println(ref1.next());
         }
         System.out.println(" ");
         while(ref1.hasPrevious()) {
        	 System.out.println(ref1.previous());
         }
         System.out.println(" ");
         System.out.println("Peek :"+names.peek());
         System.out.println("Peek first :"+names.peekFirst());
         System.out.println("Peek last :"+names.peekLast());
         System.out.println(" ");

         System.out.println("Element :"+names.element());
         System.out.println("Get based on index :"+names.get(4));
         System.out.println("Get First :"+names.getFirst());
         System.out.println("Get Last :"+names.getLast());
         System.out.println(" ");

         System.out.println("Poll First :"+names.pollFirst());
         System.out.println("Poll Last :"+names.pollLast());
         names.push("kushal");
         System.out.println(names);
         System.out.println("Pop element :"+names.pop());

        // System.out.println(" ");
         System.out.println("Remove First :"+names.removeFirst());
         System.out.println("Remove Last :"+names.removeLast());
         System.out.println("Remove First Occurence :"+names.removeFirstOccurrence("Red"));
         System.out.println("Remove based index :"+names.remove(2));
         System.out.println(names);

		
		// TODO Auto-generated method stub

	}

}
