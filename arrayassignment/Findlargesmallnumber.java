package xworkz.arrayassignment;

public class Findlargesmallnumber {

	public static void main(String[] args) {
		int num[]=new int[] {12,45,43,86,39,70};
		
		int large=num[0];
		int small=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>large)
				large=num[i];
			else if(num[i]<small)
				small=num[i];
			
		}
		System.out.println("The " +large+ " is the largest number");
		System.out.println("The " +small+ " is the smallest number");
		// TODO Auto-generated method stub

	}

}
