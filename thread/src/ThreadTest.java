

package com.briup.thread;

public class ThreadTest extends Thread
{
	private int n;
	//private String name;
	private static boolean stopFlag = false;;	
	public ThreadTest(String name, int n)
	{
		//this.name = name; 
		super(name);
		this.n = n;
	}
	public void print()
	{
        if(getName().equals("Jerry"))
		{
			try
			{
			  sleep(10);
			}catch(InterruptedException e)
			{
			   System.out.println(e.getMessage());
			}
        }
		for(int i=1; i<=n; i++)
		{
		    if(stopFlag) 
				break;
			System.out.println("thread id: "+getId()+"  name: "+getName()+" i: "+i);
			
		}
		stopFlag = true;	
	}
	public void run()
	{
		print();
	}

	public static void main(String[]args)
	{
		ThreadTest t1 = new ThreadTest("Tom",100);
		ThreadTest t2 = new ThreadTest("Jerry",100);
	
		//t2.run();
		//t1.run();
		//t1.start();
		t2.start();
		t1.start();

		/*
		for(int i=1; i<=100; i++)
			System.out.println("thread id: "+Thread.currentThread().getId()+"  name: "+Thread.currentThread().getName()+" i: "+i);
		*/
	
	}
}


