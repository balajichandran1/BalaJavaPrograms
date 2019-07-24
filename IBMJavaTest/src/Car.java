/***Super class ***/
class Vehicle {     
	int modelno;     
	String modelname;     
	String color;          
	Vehicle(int modelno,String modelname,String color) 
	{         
		this.modelno = modelno;         
		this.modelname = modelname;         
		this.color = color;     
		}          
	 void displayDetails() {
        System.out.println("Model No: " + modelno);
        System.out.println("Name: " + modelname);
        System.out.println("Color: " + color);
    }
}
//sub class//
public class Car extends Vehicle{
	boolean acType;          
	Car(boolean acType,int modelno,String modelname,String color) 
	{         
		super(modelno,modelname,color);   //calling super class constructor//      
		this.acType = acType;     
		}    
	//final void displayDetails() {
     //   System.out.println("Model No: " + modelno);
      //  System.out.println("Name: " + modelname);
      //  System.out.println("Size: " + color);
   // }
	void dislayCarDetails() 
	{         
		if(acType)              
			System.out.println("AC");         
		else             
			System.out.println("Non AC");     
		}      

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Car(true,100,"maruti car","blue");         
		obj.displayDetails();         
		obj.dislayCarDetails();     
		} 
	}

