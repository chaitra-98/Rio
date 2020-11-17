package set;

import java.util.Iterator;
import java.util.TreeSet;

public class Stringset {

		public static void main(String[] args) {
			
			TreeSet<String> colors = new TreeSet<String>();
			colors.add("red");
			colors.add("blue");
			colors.add("pink");
			colors.add("black");
			colors.add("green");
			System.out.println(colors);
			System.out.println("Using Iterator");
			
			Iterator<String> itr = colors.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("Using Floor method : " + colors.floor("green"));
			System.out.println("Using Ceiling method : " + colors.ceiling("pink"));
			System.out.println("Using first method : " + colors.first());
			System.out.println("Using last method : " + colors.last());
			System.out.println("Using poll first method : " + colors.pollFirst());
			System.out.println("Using poll last method : " + colors.pollLast());
			System.out.println(colors);
			
			
			
		
		}
		
		// TODO Auto-generated method stub

	}


