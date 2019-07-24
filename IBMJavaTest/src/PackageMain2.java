import FirstPackage.*;
import SecondPackage.*;

class p {
	void display()
	{
		System.out.println("Display method of P Class");
	}
}

public class PackageMain2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstPackage.Test obj = new FirstPackage.Test();
		obj.firstdisplay();
		// TODO Auto-generated method stub
		Test1 obj1 = new Test1();
        obj1.seconddisplay();
        
        p obj2 = new p();
        obj2.display();

	}

}
