package xworkz.arrayassignment;

public class ArrayIntersection {
	
public static void main(String args[]) {
	int a[]= {21,34,41,22,35};
	int b[]= {61,34,45,21,11};
	System.out.println("intersection of array");
	 
	for(int i=0;i<a.length;i++){
		for(int j=0;j<b.length;j++) {
			if(a[i]==b[j]) {
				System.out.println(a[i]);
			}
		}
	}
	
}
}
