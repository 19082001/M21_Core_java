package com.cg.multitreading;
class Thread8 extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(1000);
			System.out.println("work");
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception handled "+e);
		}
		System.out.println("thread is running");
	}
}
public class Example6practice
{

	public static void main(String[] args)
	{
		Thread8 t1 = new Thread8();
		t1.start();
		t1.interrupt();

	}

}

