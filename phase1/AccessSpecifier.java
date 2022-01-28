package core.programs.assissted.project;


public class AccessSpecifier{

	public static void main(String[] args) {
		//default
		System.out.println("Default Access Specifier : ");
		DefualtAccess obj = new DefualtAccess(); 		  
      obj.display(); 
     
     obj.displayprotected();
     obj.displaypublic();

	}
}

