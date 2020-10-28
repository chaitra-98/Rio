package functionalinterface;
import java.util.function.Consumer;

public class ConsumerFI {

	public static void main(String[] args) {
		//void accept(T t);
		
		Consumer<String>Color=(str)->System.out.println("The material of "+str+" color bottel is steel");
		Color.accept("red");// TODO Auto-generated method stub

	}

}
