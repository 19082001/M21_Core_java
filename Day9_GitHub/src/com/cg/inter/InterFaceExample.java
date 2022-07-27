package com.cg.inter;

public interface InterFaceExample {

	void display1();
}
class X implements InterFaceExample{
	//provided the implementation for abstract method inside the demo class
	
	@Override
	public void display1() {
		System.out.println("InterFace Example");
	
		

	}

}
