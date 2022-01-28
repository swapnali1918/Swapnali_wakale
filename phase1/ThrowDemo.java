package core.programs.assissted.project;
public class ThrowDemo {
	
	        public static void main(String[] args)
        {
            int a=12,b=0,rs=0;
            try
            {
                rs = a / b;
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\n\tError : " + Ex.getMessage());
            }
            finally
            {
                System.out.print("\n\tThe result is : " + rs);
            }
        }
    }

class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 
