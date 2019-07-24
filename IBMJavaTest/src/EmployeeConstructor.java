
public class EmployeeConstructor {
	int empId;
	String empName;

	EmployeeConstructor() {
		// TODO Auto-generated constructor stub
		empId = 123;
		empName = "Balaji";
	}
	EmployeeConstructor(int empId,String empName) {
		// TODO Auto-generated constructor stub
		this.empId = empId;
	    this.empName = empName;
	}
	void displayEmpDetails()
	{
		System.out.println("Id: " + empId);
		System.out.println("EmpName: " + empName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeConstructor emp = new EmployeeConstructor();
		emp.displayEmpDetails();
	    emp = new EmployeeConstructor(123,"Bala");	
	    emp.displayEmpDetails();
	}

}
