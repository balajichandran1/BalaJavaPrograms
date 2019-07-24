
public class ExceptionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int num1 = 10;
		int num2 = 0;
		int num3 =  num1/num2;
		System.out.println("result: " + num3);
		 

	}
		catch(ArithmeticException e) 
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Final Block");
		}
		System.out.println("Continue execution of the program");
		}

}
