package xworkz.arrayassignment;

public class Watchtesting1 {
public static void main(String[] args) {
		
		Watcharray1[] watch = new Watcharray1[5];
		
		
		Watcharray1 fastrack = new Watcharray1("Fastrack","square",5000);
		watch[0]=fastrack;
		
		Watcharray1 titan = new Watcharray1("titan","oval",2500);
		
		watch[1]=titan;
		
		for(int i=0;i<watch.length;i++) {
			if(watch[i]!=null) {
			Watcharray1 w =watch[i];
			w.function();
			w.details();
			
			}
					
		}
		System.out.println("For each");
		for(Watcharray1 w : watch) {
			if(w!=null)
				w.function();
				w.details();
		}
		
}
}

