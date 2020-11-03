package collection;
import java.util.ArrayList;

public class ArraylistChar {

	public static void main(String[] args) {
		ArrayList<Character> ref = new ArrayList<Character>();
		
		ref.add('A');
		ref.add('a');
		ref.add('e');
		ref.add('i');
		ref.add('o');
		ref.add('u');
		
		System.out.println(ref);
		
		System.out.println("updating first element :" +ref.set(0, 'Z'));
		
		System.out.println("Displaying 5th char :"+ref.get(5));
		
		System.out.println("displya 3rd element :"+ref.get(3));
		
		System.out.println(ref.isEmpty());
		
		System.out.println("List of charachters :"+ref);
		
		 System.out.println(ref.contains('Z'));
		
		
		
		
		// TODO Auto-generated method stub

	}

}
