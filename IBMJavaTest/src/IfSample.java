import java.util.Scanner;

public class IfSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x >y)
		{
			System.out.println("X is greater than Y" + "," + "as X is " + x + " but Y is " + y);
		} 
		else
		{
			System.out.println("Y is greater than X" + "," + "as X is " + x + " but Y is " + y);
		} 
			

	}

}
