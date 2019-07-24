
//public class ExceptionProgram2 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

//	}

//}
public class ExceptionProgram2 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 10;
            int num3 = num1 / num2;
            
            System.out.println("result: " + num3);
            
            try {
                String names[] = {"ram","vinod","vinay","sunil","manzoor"};
                
                for(int i=0;i<=names.length;i++) {
                    System.out.println(names[i]);
                }                
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
        catch(NullPointerException e) {
            System.out.println(e);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Final block");
        }
        System.out.println("Continue execution of the program");
    }
}
