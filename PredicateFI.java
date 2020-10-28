package functionalinterface;
import java.util.function.Predicate;

public class PredicateFI {

	public static void main(String[] args) {
	
		Predicate<Integer>functionalinter=(x)->x+10>50;
		System.out.println(functionalinter.test(2)); //boolean(T t);
		
		// TODO Auto-generated method stub

	};

}
