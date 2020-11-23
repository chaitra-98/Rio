package threadconcept.examples;

import java.util.ArrayList;

public class ArraylistThread extends Thread{
	@Override
	   public void run() {

		   System.out.println("Thread details :"+Thread.currentThread().getName());

			ArrayList<String> str=new ArrayList<String>();
			str.add("chai");
			str.add("arun");
			str.add("sin");
			str.add("ved");
			str.add("kannu");
			//System.out.println(str);

			str.forEach((a)->System.out.println(a));

		 System.out.println("Thread details :"+Thread.currentThread().getName());



		}

}
