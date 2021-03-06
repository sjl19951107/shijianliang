

package com.briup.thread;

//public class ThreadTest extends Thread
public class RThreadTest implements Runnable
{
	private int n;
	private String name;	
	public RThreadTest(String name, int n)
	{
		this.name = name; 
		this.n = n;
	}
	public void print()
	{
		for(int i=1; i<=n; i++)
		{
			System.out.println("thread id: "+Thread.currentThread().getId()+" name: "+name+" i: "+i);
		}
	}
	public void run()
	{
		print();
	}

	public static void main(String[]args)
	{
		RThreadTest r1 = new RThreadTest("Tom",100);
		RThreadTest r2 = new RThreadTest("Jerry",80);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t2.start();
		t1.start();

		try
		{
		  t1.join();
		  t2.join();
		}catch(InterruptedException e)
		{
		   e.printStackTrace();
		}

		System.exit(-1);
		//main
		/*
		for(int i=1; i<=200; i++)
		{
			System.out.println("thread id: "+Thread.currentThread().getId()+" name: "+Thread.currentThread().getName()+" i: "+i);
		}	
		*/
	}
}


