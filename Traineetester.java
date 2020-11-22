package hashmap;

import java.util.HashMap;

public class Traineetester {
	public static void main(String[] args) {

	
		HashMap<Trainee,Integer> trainee = new HashMap<Trainee,Integer>();

		Trainee t1=new Trainee("krupa", 121,"Java");
		Trainee t2=new Trainee("sindhu", 145,"HTML");
		Trainee t3=new Trainee("chaitra", 165,"web");
		Trainee t4=new Trainee("vedha", 132,"sql");

		trainee.put(t1, 25);
		trainee.put(t2,65);
		trainee.put(t3,60);
		trainee.put(t4,32);

		System.out.println(trainee);

		//Traversing
		trainee.forEach((k,v)->System.out.println("key:" + k +  " value: " + v));

	}

}
