import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class DateProgram2 {

	public static void main(String[] args) throws ParseException
	{
		// TODO Auto-generated method stub
       SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        
        Date d = new Date();
        System.out.println(d);
        
        String dob = "01-07-2019";
        Date date = format.parse(dob);
        System.out.println(date);
    }

}
