
import java.util.Scanner;
public class UserDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int sal = sc.nextInt();
	        
	        try {
	        
	        if(sal < 0)
	           throw new SalaryException("salary can't be negative");
	        else
	            System.out.println(sal);
	        }
	        catch(SalaryException e) {
	           System.out.println(e);
	            }
	        
	            try {
	    	        	    	        if(sal == 0)
	    	           throw new SalaryException("salary can't be zero");
	    	        //else
	    	          //  System.out.println(sal);
	    	        }
	    	        catch(SalaryException e) {
	    	            System.out.println(e);
	        }
	    }
	
	}


