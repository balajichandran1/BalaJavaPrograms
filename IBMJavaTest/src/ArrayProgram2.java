import java.util.*;

public class ArrayProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Names : " );
		
		String names[] = new String[5];
		//int size = sc.nextInt();
		//sc.nextLine();

		Scanner sc = new Scanner(System.in);
		
				
		for(int i=0; i<=4  ; i++)
		{
			names[i] = sc.nextLine();
		}
		System.out.println("------Names will be printed below : -----");
		
		for(int i=0; i<=4 ; i++) {
		System.out.println(names[i]);
		}
		
		System.out.println("------Names will be printed in reverse order : -----");
		for(int i=4; i>=0 ; i--) {
			System.out.println(names[i]);
	}
	}
}
