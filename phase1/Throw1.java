package core.programs.assissted.project;
public class Throw1 {
	
        void Division() throws ArithmeticException
        {
            int a=12,b=0,rs;
            rs = a / b;
            System.out.print("\n\tThe result is : " + rs);
        }
         public static void main(String[] args)
        {
        	 Throw1 T = new Throw1();
             try
            {
                T.Division();
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\n\tError : " + Ex.getMessage());
            }
            System.out.print("\n\tEnd of program.");
        }
    }

