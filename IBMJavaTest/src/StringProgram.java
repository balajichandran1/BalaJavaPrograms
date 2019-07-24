import java.util.*;
public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Firstname = "Balaji";
		String Middlename = "Balaji";
		String LastName = new String ("Chandran");
		System.out.println("Full name is : "  + Firstname + LastName);
		System.out.println("Firstname UpperCase : "  + Firstname.toUpperCase() + LastName);
		System.out.println("Index of a : "  + Firstname.indexOf("a") );
		//System.out.println("Count of a : "  + LastName.count("a") );
		System.out.println("FirstName contains 'C' : "  + Firstname.contains("c") );
		System.out.println("FirstName length : "  + Firstname.length() );
		System.out.println("LastName length  : "  + LastName.length() );
		System.out.println("Is LastName & Firstname are same : "  + Firstname.equals(LastName));
		System.out.println("Is MiddleName & Firstname are same : "  + Firstname.equals(Middlename));
	}

}
