import java.util.*;
public class SetPrgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> values = new TreeSet<String>();
	// SortedSet<String> values = new TreeSet<String>();
		values.add("Balaji");
		values.add("Raj");
		values.add("Jegan");
		values.add("Balaji");
		values.add("Dandapani");
		values.add("Chandran");
		for(String m : values)
		{
			System.out.println(m);
		}
		System.out.println(values.size());
	}

}
