package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;


public class AdharNumber {
	public static void main(String[] args) {
		
	
	LinkedHashMap<Integer,String> adharnumber = new LinkedHashMap<Integer,String>();

	adharnumber.put(1256,"sin");
	adharnumber.put(568, "ved");
	adharnumber.put(3254, "chai");
	adharnumber.put(4568, "kannu");

	System.out.println(adharnumber);

	//corresponding key value will be displayed
	System.out.println("Adharnumber person name is:" + adharnumber.get(1256));
	System.out.println("Adharnumber person name is:" + adharnumber.get(568));
	System.out.println("Adharnumber person name is:" + adharnumber.get(3254));
	System.out.println("Adharnumber person name is:" + adharnumber.get(4568));


	//Traversing
	Set<Entry<Integer,String>> entry = adharnumber.entrySet();
	for(Entry<Integer,String> e : entry) {
		System.out.println("key: " + e.getKey() + " value: " + e.getValue());
	}


}

}
