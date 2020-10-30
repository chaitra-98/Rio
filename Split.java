package String;

public class Split {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		
		String file="Welcome,to,xworkz,and,you,are,learning,string,methods,in,java";
		String []folder=file.split(",");
		for(String s :folder) {
			System.out.println("the split file is :"+s);
		}
		// TODO Auto-generated method stub

	}

}
