

package com.briup.thread;


public class InterruptTest extends Thread
{
	public InterruptTest(String name)
	{
		super(name);
	}
	public void print()
	{
		    System.out.println("running...");
			try
			{
			  sleep(1000);
			}catch(InterruptedException e)
			{
			   System.out.println("catch interrupt exception: "+e.getMessage());
			}
		    System.out.println("do something...");
	}
	public void run()
	{
		print();
	}

	public static void main(String[]args)
	{
	    InterruptTest t1 = new InterruptTest("Tom");
		t1.start();
	    System.out.println("1 thread isInterrupted: "+t1.isInterrupted());
        t1.interrupt();
	    System.out.println("2 thread isInterrupted: "+t1.isInterrupted());
		t1.interrupted();
	    System.out.println("3 thread isInterrupted: "+t1.isInterrupted());
	}
}


