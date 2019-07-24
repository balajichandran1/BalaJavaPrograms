import java.util.*;
public class ListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generic Classes
		//ArrayList<String> names = new ArrayList<String>();
		//add is used to add a value into the arraylist
		//names.add("Balaji");
		//names.add("Chandran");
		//names.add("Dandapani");
		//names.add("Eshwar");
		//names.add("Farhan");
		
		ArrayList<Integer> names = new ArrayList<Integer>();
				//add is used to add a value into the arraylist
				names.add(1);
				names.add(786);
				//names.add("Dandapani");
				//names.add("Eshwar");
				//names.add("Farhan");
		
		//for each enhanced loop
		//for(String nm : names) {
				for(Integer nm : names) {
			System.out.println(nm);
		}

	}

}
