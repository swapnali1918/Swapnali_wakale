package core.programs.assissted.project;

import java.io.*;

class Line
{

	synchronized public void getLine()                     
	{
		
		for(int i=1;i<=3;i++)
		{
			try{
	    		Thread.sleep(2000);  // 2000 miliseconds = 2 secs
	    	}
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    }  
		System.out.println("running thread state is : "+ Thread.currentThread().getName()+ " ::: " + Thread.currentThread().getState());  // it will print state of the thread running
	    System.out.println("Thread Name : "+ Thread.currentThread().getName()+ " ::: "+ i);  
	    System.out.println("Is my thread alive or not? : "+ Thread.currentThread().getName()+ " ::: " + Thread.currentThread().isAlive());  // it will heck if thread is alive or dead
	    System.out.println("The thread id is : "+ Thread.currentThread().getName()+ " ::: " + Thread.currentThread().getId()); // CPU scheduler has given a unique ID to each thread
		}  
	
		}
	}

class Sync extends Thread
{
	// reference to Line's Object.
	Line line;

	Sync(Line line)
	{
		this.line = line;
	}

	@Override
	public void run()
	{
		line.getLine();
	}
}

public class SyncThread  {

		
	public static void main(String[] args) {
		
		Line obj = new Line();

		// creating the threads that are sharing the same Object.
		Sync train1 = new Sync(obj);
		Sync train2 = new Sync(obj);
		Sync train3= new Sync(obj);
		
		train1.setName("IT");
		train2.setName("HR");
		train3.setName("Finance");
		
		train1.start();
		train2.start();
		train3.start();
		
		

	}

}
