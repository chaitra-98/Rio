package Userinputprogram;
import java.util.Scanner;

public class UserinputPalindromePrgm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input a number");
		int n = in.nextInt();
		int sum=0,r;
		int temp =n;
		while(n>0) {
			r = n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
	
	if(temp==sum)
		System.out.println("it is a palindrome number");
	else
		System.out.println("not a palindrome a number");

}
}
