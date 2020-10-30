package String;

public class CharCount {
	 public static long count(String s, char ch) 
	    { 

	        return s.chars().filter(c -> c == ch) .count(); 


	    } 

	    // Driver method 
	    public static void main(String args[]) 
	    { 
	        String str = "hiiiiiigooodmorning"; 
	        char c = 'o'; 
	        System.out.println(count(str, c)); 
	    } 

}
