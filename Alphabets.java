package String;

public class Alphabets {

	public static void main(String[] args) {
		String str="MICK check 123123 !!";
		boolean res= str.chars().allMatch(Character::isLetter);
		System.out.println("does it contains only alphabets :"+res);
		// TODO Auto-generated method stub

	}

}
