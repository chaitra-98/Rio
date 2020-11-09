package arraylistsorting;
import java.util.ArrayList;
import java.util.Collections;

public class Sortdouble {

	public static void main(String[] args) {
		ArrayList<Double> grade = new ArrayList<Double>();
		grade.add(6.5);
		grade.add(7.65);
		grade.add(4.68);
		grade.add(8.8);
		grade.add(9.78);
		grade.add(4.68);
		grade.add(5.00);
		grade.add(7.98);
		grade.add(6.58);
		grade.add(7.00);
		System.out.println(grade);
		
		Collections.sort(grade);
		System.out.println("the ascending list is :"+grade);
		Collections.reverse(grade);
		System.out.println("dscending order list :"+grade);

		// TODO Auto-generated method stub

	}

}
