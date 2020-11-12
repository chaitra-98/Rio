package linkedlist;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Flowertester {

	public static void main(String[] args) {
		
		Flowers f1= new Flowers("red",25,"rose");
		Flowers f2= new Flowers("white",50,"jasmin");
		Flowers f3= new Flowers("pink",15,"hibiscus");
		Flowers f4= new Flowers("yellow",100,"champa");
		
		LinkedList<Flowers> flower = new LinkedList<Flowers>();
		flower.add(f1);
		flower.add(1, f2);
		flower.addFirst(f3);
		flower.offer(f4);
		System.out.println(flower);
		
		for(Flowers f:flower) {
			System.out.println(f);
		}
		System.out.println("Iterator ");
		Iterator<Flowers> ref=flower.iterator();
		while(ref.hasNext()) {
			System.out.println(ref.next());
		}
		System.out.println("List Iterator ");
		ListIterator<Flowers> ref1=flower.listIterator();
		while(ref1.hasNext()) {
       	 System.out.println(ref1.next());
        }
		System.out.println(" ");
        System.out.println("Remove First :"+flower.removeFirst());
        System.out.println("Remove Last :"+flower.removeLast());
        System.out.println("Remove First Occurence :"+flower.removeFirstOccurrence(f3));
        System.out.println("Remove based index :"+flower.remove(1));
        System.out.println(flower);

		
		// TODO Auto-generated method stub

	}

}
