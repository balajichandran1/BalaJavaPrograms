import java.util.Scanner;

public class ElseIfSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x >y)
		{
			System.out.println("X is greater than Y" + "," + "as X is " + x + " but Y is just " + y);
		} 
		else if (y > x)
		{
			System.out.println("Y is greater than X" + "," + "as X just is " + x + " but Y is " + y);
		} 
		else 
			System.out.println("X is equal to Y" + "," + "as X is " + x + " and Y is also " + y);
	}

}
