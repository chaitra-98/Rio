package arraylistsorting;
import java.util.Comparator;


public class Student {
	
		private int age;
		private String name;
		private String Adress;
		public Student(int age, String name, String adress) {
			super();
			this.age = age;
			this.name = name;
			Adress = adress;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAdress() {
			return Adress;
		}
		public void setAdress(String adress) {
			Adress = adress;
		}
		@Override
		public String toString() {
			return "Student [age=" + age + ", name=" + name + ", Adress=" + Adress + "]";

	    }
		//@Override
		public class AgeSorter implements Comparator<Student> {
		public int compare(Student s1, Student s2) {
			int age1 = s1.getAge();
			   int age2 = s2.getAge();
			   return age1-age2;
		}}

}
