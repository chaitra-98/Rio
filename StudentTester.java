package functionalinterface;
import java.io.*;

public class StudentTester {

	public static void main(String[] args) {
		try {
			Student std=new Student(20201,"chaitra");
			Student std1=new Student(20202,"sindhu");
			Student std2=new Student(20203,"vedha");
			FileOutputStream fout=new FileOutputStream("output.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(std);
			out.writeObject(std1);
			out.writeObject(std2);
			System.out.println("Serialization excecuted succesfully");


			

		}
		catch(Exception e) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
