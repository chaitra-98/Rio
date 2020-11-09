package arraylistsorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortString {

	public static void main(String[] args) {
		ArrayList<String> ref = new ArrayList<String>();
		ref.add("Hoddie");
		ref.add("Fullneck");
		ref.add("Collar");
		ref.add("Sports");
		
		System.out.println(ref);
		
		Collections.sort(ref);
		System.out.println(ref);
		// TODO Auto-generated method stub

	}

}
