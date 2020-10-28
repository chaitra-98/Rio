package functionalinterface;
import java.util.function.Function;

public class FunctionFI {

	public static void main(String[] args) {
		Function<Integer,Float >functionalinterface=(z)->z+5f;
		functionalinterface.apply(80);
		System.out.println("The value is :"+functionalinterface.apply(80)); //R apply(T t);
		// TODO Auto-generated method stub

	}

}
