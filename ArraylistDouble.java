package collection;
import java.util.ArrayList;

public class ArraylistDouble {
	public static void main(String[] args) {
		ArrayList<Double> ref = new ArrayList<Double>();
		
		ref.add(10.2);
		ref.add(82.00);
		ref.add(38.00);
		ref.add(55.00);
		ref.add(22.00);
		System.out.println("The list of numbers are :"+ref);
		ref.remove(38.00);
		
		System.out.println("The updated list after removing :"+ref);
		System.out.println("printing using for loop");
		
		for(int i=0;i<ref.size();i++) {
			System.out.println(ref.get(i));
			
			
		}
		System.out.println("printing using enhanced for loop");
		
		for(Double i : ref) {
			System.out.println(i);
		}
		Double first = ref.get(0);  //first element
		System.out.println("the first element is  :"+first);
		
		Double last= ref.get(ref.size()-1); //last element
		System.out.println("the last element is  :"+last);

		// TODO Auto-generated method stub

	
	}

}
