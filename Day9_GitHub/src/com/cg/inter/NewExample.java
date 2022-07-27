package com.cg.inter;

interface Inf{
	int x=10;
	void display();
	
}
class Demo implements Inf
{
	@Override
	public void display() {
		System.out.println("Interface" + "The value of x is : " +x);
	}
	
	
}
public class NewExample {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
	}

}
