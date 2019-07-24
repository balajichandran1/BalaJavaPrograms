
public class WrapperProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sample for Upcasting
		int i = 10;
		double j = i;
		System.out.println("Sample for Upcasting converting 10 to 10.0");
		System.out.println(j);
		
		//Sample for Downcasting
		System.out.println("Sample for Downcasting converting 100l to 100");
		long p = 100l;
		int p1 =  (int)p;
		System.out.print(p1);
		
		//Boxing
		int x = 10;
		Integer y = x;
		//System.out.Println(y)
	}

}
