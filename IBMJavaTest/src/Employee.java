import java.util.*;
public class Employee {
	  int empId;
	  String empname;
	  String address;
		// TODO Auto-generated method stub
	  void acceptEmpDetails() {
		  
		  for (int i=0;i<=2;i++)
		    {
			  System.out.println("Enter the values");
		    	Scanner scanner = new Scanner(System.in);
	      empId = scanner.nextInt();
	      scanner.nextLine();
	      empname = scanner.nextLine();
	      address = scanner.nextLine();
		    }
	  }
	  void displayEmpDetails() {
		  for (int i=2;i>=0;i--) {
		  System.out.println("The values are ");
	      System.out.println("Employee Id: " + empId);
	      System.out.println("Name: " + empname);
	      System.out.println("Address: " + address);
		  }
	  }
	  public static void main(String[] args) {
		//  Employee emp; 
		  Employee emp = new Employee(); 
		// emp.acceptEmpDetails();
	     // emp.displayEmpDetails();
    for (int i=0;i<=2;i++)
    {
    	 	emp.acceptEmpDetails();
    	 	emp.displayEmpDetails();
	}
	  }
}
