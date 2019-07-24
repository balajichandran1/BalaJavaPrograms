import java.util.*;
public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][] = new int [3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("----Enter the number for array program------");
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++) {
			num[i][j] = sc.nextInt();
		}
		}
		System.out.println("-----Output-----");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++) {
				System.out.print(num[i][j] + " ");
		}
			System.out.println();
		}
		
	}
	

	
	
}
