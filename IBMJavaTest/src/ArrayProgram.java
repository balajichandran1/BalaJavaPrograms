import java.util.*;
public class ArrayProgram {

	//private static Scanner sc;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		//sc.nextLine();

		
		System.out.println("Enter the size of Array" + size);
				String names[] = new String[size];
		for(int i=0; i<=4  ; i++)
		{
			names[i] = sc.nextLine();
		}
		System.out.println("------Names will be printed below : -----");
		
		for(int i=0; i<=4 ; i++) {
		System.out.println(names[i]);

	}

}
}