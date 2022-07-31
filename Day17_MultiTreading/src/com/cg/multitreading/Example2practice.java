package com.cg.multitreading;

public class Example2practice extends Thread
		{

			public void run()
			{
				System.out.println("Process Error");
			}
			
			public static void main(String[] args) {
				Example2practice e = new Example2practice();
				e.start();
				e.run();
				e.run();

			}	

}
