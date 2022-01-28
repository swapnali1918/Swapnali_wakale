package core.programs.assissted.project;

public class DefualtAccess {

	void display() 
	   { 
	       System.out.println("You are using defalut access specifier\n"); 
	       displayprivate();
	   } 
	 

	private void displayprivate() 
	{ 
		System.out.println("Private Access Specifier : ");
		System.out.println("You are using private access specifier\n"); 
	} 
	protected void displayprotected() 
    { 
		System.out.println("Protected Access Specifier : ");
        System.out.println("This is protected access specifier\n"); 
    } 
	public void displaypublic() 
    { 
		System.out.println("Public Access Specifier : ");
        System.out.println("This is public access specifier\n"); 
    } 


}

