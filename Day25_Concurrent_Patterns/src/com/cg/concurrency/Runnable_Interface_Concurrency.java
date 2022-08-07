package com.cg.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runnable_Interface_Concurrency implements Runnable
{
	Main m;
	int n;
	String task;
    public Runnable_Interface_Concurrency(Main m, int n, String task)
	{
    	this.m= m;
        this.n= n;
    	this.task=task;
	}
    public void run()
    {
    	for(int i=0;i<3;i++)
    	{
    		System.out.println("Thread "+Thread.currentThread().getName());
    		m.pause(Math.random());
    	}
    }
    
}
class Main
{
	public void print()
	{
		ExecutorService t=Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++)
		{
			t.execute(new Runnable_Interface_Concurrency(this, i+1, "task"+(i+1)));
			
		}
		t.shutdown();
	}
    void pause(double seconds)
    {
    	try
    	{
    		Thread.sleep(Math.round(1000.0*seconds));
    	}
    	catch(InterruptedException e)
    	{
    		System.out.println("Exception occurred "+e);
    	}
    }
	public static void main(String[] args) 
	{
		
          new Main().print();
	}

}
