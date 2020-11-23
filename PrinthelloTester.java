package threadconcept.examples;

public class PrinthelloTester {
	public static void main(String[] args) {

		   System.out.println("Thread details :"+Thread.currentThread().getName());


		PrintHello print=new PrintHello();
		print.start();

		Runnable printWelcome=()->{
			System.out.println("Thread details :"+Thread.currentThread().getName());

			for(int i=1;i<=5;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println("Welcome");
			}
			System.out.println("End details :"+Thread.currentThread().getName());

		};
		Thread t1=new Thread(printWelcome);
		t1.start();


	   System.out.println("End details :"+Thread.currentThread().getName());

	}

}
