package collection;

import java.util.ArrayList;

public class FrameTester {

	public static void main(String[] args) {
		
		Frame wood = new Frame(false,"wooden",4.3);
		Frame Fibre = new Frame(true,"fibrematerial",19.8);
		Frame glass = new Frame(false,"glassmaterial",8.4);
		Frame plastic = new Frame(true,"plasticmaterial",8.4);
		
		ArrayList<Frame> framelist = new ArrayList<Frame>();
		framelist.add(wood);
		framelist.add(Fibre);
		framelist.add(glass);
		framelist.add(plastic);
		
		for(Frame i: framelist) {
			System.out.println(i);
		}
		System.out.println("enhanced for loop******************");

		System.out.println(framelist.get(framelist.size()-1));
		//System.out.println(framelist.set(2,plastic));
		System.out.println("updating the 3rd element with new object");
		for(int i=0;i<framelist.size();i++) {
			Frame f= framelist.get(i);

			boolean isifchangebale= f.isIfchangebale();
			f.setIfchangebale(true);

			 String getMaterial=f.getMaterial();
			 f.setMaterial("steel");
			 System.out.println(f);
		}
		



		// TODO Auto-generated method stub

	}

}
