import java.util.Scanner;

public class SwitchSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch(num) {
		case 1 : System.out.println("Number 1");
		//break;
		case 2 : System.out.println("Number 2");
		//break;
		default: System.out.println("Invalid Option");
		}

	}

}
