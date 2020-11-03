package collection;

import java.util.ArrayList;

public class Simpleexample {

	public static void main(String[] args) {
		
		int example[]= new int[15];
		example[1]=10;
		example[2]=50;
		// TODO Auto-generated method stub
		ArrayList ref= new ArrayList<>();
		ref.add("chaitra");
		ref.add(22);
		ref.add("bangalore");
		System.out.println("The details of person is :"+ref);
		
		System.out.println( "The size is :" +ref.size());
		System.out.println(ref.isEmpty());
		System.out.println(ref.remove(0));

		
		
	}

}
