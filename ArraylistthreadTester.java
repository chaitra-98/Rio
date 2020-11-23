package threadconcept.examples;

public class ArraylistthreadTester {
	public static void main(String[] args) {


		   System.out.println("Thread details :"+Thread.currentThread().getName());

		ArraylistThread t1=new ArraylistThread();
		t1.start();

		   System.out.println("End details :"+Thread.currentThread().getName());

	}

}
