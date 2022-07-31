package com.cg.multitreading;

class Thread9 extends Thread
{
	public void run()
	{
			System.out.println("Thread interruption");
		}
	
		
}
public class Example5practice
{

	public static void main(String[] args)
	{
		Thread9 t9 = new Thread9();
		t9.start();
	     System.out.println("is thread interrupted "+t9.isInterrupted());
	     t9.interrupt();
	     System.out.println("is thread interrupted "+t9.isInterrupted());
		}

	

}
