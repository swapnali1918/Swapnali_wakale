package core.programs.assissted.project;


class ExceptionHand  extends Exception 
{ 
    public ExceptionHand(String s) 
    { 
        super(s); 
    } 
} 
public class ExceptionHandling 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("temp"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}

