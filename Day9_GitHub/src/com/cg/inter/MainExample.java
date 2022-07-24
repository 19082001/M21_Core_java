package com.cg.inter;
interface Vehicle{
	void speed();
}
interface Car extends Vehicle
{
	void engine();
	
}
class Bus implements Car
{
	public void engine() 
	{
		System.out.println("petrol");
	}
	

public void speed() {
	System.out.println("speed is 49km/L");
}
public class MainExample {

	public void main(String[] args) {
	   Bus b=new Bus();
	   b.engine();
	   
    
	}

}
}
