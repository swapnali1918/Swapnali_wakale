package core.programs.assissted.project;

public class CreationOfThread extends Thread {
	
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	 		CreationOfThread ct = new  CreationOfThread();
	  		ct.start();
	 	}
	}

