import java.util.*;
public class ListProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
				//add is used to add a value into the arraylist
				names.add("Balaji");
				names.add("Chandran");
				names.add("Dandapani");
				names.add("Eshwar");
				names.add("Farhan");
				for(String nm : names) {

			System.out.println(nm);
		}
				names.remove(0);
				names.remove("Farhan");
				System.out.println("----Updated List-----");
				for(String nm : names) {

					System.out.println(nm);
				}
				
				System.out.println(names.contains("Balaji"));
				System.out.println(names.indexOf("Chandran"));
				System.out.println(names.size());
				//names.clear()
				names.add(2,"Ganesh");
				System.out.println("----Updated List1-----");
				for(String nm : names) {

					System.out.println(nm);
				}
				names.set(3,"Karthik"); //replace
				System.out.println("----Updated List2-----");
				for(String nm : names) {

					System.out.println(nm);
				}
				names.clear();
				System.out.println("----Updated List3-----");
				for(String nm : names) {

					System.out.println(nm);
				}System.out.println("---names are cleard---");
	}

}
