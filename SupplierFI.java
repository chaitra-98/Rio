package functionalinterface;
import java.util.function.Supplier;

public class SupplierFI {

	public static void main(String[] args) {
		Supplier<Integer>ref=()->1000;
		System.out.println(ref.get());
		// TODO Auto-generated method stub

	}

}
