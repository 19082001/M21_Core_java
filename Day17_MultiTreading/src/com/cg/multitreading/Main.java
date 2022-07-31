package com.cg.multitreading;

public class Main extends Thread
{

	public void run()
	{
		System.out.println("Thread Passed");
	}

	public static void main(String[] args) {
		Main e = new Main();
		e.start();
		//when we passed two time start method then they give error because all ready the start method is in process.
       // e.start();
	}

}
