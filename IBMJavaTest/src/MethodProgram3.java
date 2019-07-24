
public class MethodProgram3 {

    static int multi(int num1,int num2,int num3)      
    {          return num1 * num2 * num3;      
    }          
    int sum(int num1,int num2,int num3) 
    {         
    	return num1 + num2 + num3;    
    	}          
    public static void main(String[] args) {         
    	//System.out.println("Sum: " + MethodProgram.sum(10, 20, 30));         
    	MethodProgram3 obj = new MethodProgram3();         
    	//calling the non static method         
    	
    
    	System.out.println("Sum of 3 nos are : " + obj.sum(100, 200, 300));         
    	//calling the static method         
    	System.out.println("Product of 3 nos are : " + MethodProgram3.multi(10, 20, 30)); 

	}

}
