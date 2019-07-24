import java.util.*;
public class MapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> values = new HashMap<Integer,String>();
		values.put(1, "Balaji");
		values.put(2, "Chandran");
		values.put(3, "Ganesh");
		for(Map.Entry m : values.entrySet())
		{
			System.out.println(m.getKey() + "," + m.getValue());
		}
	}

}
