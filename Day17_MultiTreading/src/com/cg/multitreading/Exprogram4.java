package com.cg.multitreading;
// this is example of synchronized block
class Q
{
	void print( int num)
	{
		synchronized(this)
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println(num*i);
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
				
		}
	}
}
class P extends Thread
{
	Q obj;
	P(Q obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.print(50);
	}
}
public class Exprogram4
{

	public static void main(String[] args) {
		Q a = new Q();
		P t3 = new P(a);
		P t4= new P(a);
		t3.start();
		//t4.start();
		t4.run();

	}

}
