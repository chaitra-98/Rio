package String;

public class LengthifEven {

	 public static void printWords(String s) 
	    { 

	        for (String word : s.split(" ")) 

	            // if length is even 
	            if (word.length() % 2 == 0) 

	                // Print the word 
	                System.out.println(word); 
	    } 

	    // Driver Code 
	    public static void main(String[] args) 
	    { 

	        String s ="Welcome to xworkz and you are learning string methods in java";

	        printWords(s); 
	    } 
}
