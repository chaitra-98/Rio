package String;

public class SwapChar {
	static String count(String str) {
		char[]ch=str.toCharArray();
		for (int i=0;i<ch.length;i++) {
			int k=i;
			while(i<ch.length && ch[i]!=' ')
				i++;
			
			char temp=ch[k];
			ch[k]=ch[i-1];
			ch[i-1]=temp;
		}
		return new String(ch);
		
		
	}

	public static void main(String[] args) {
		String str ="chaitra"
				+ "";
		System.out.println(count(str));
		// TODO Auto-generated method stub

	}

}
