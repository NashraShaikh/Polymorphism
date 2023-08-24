//COMPILE TIME POLYMORPHISM
//METHOD OVELOADING
package com.jsp.polymorphism;

public class Maths {
	
	public void add(int x, int y) {
		int z=x+y;
		System.out.println("Sum of the given number is "+z);
	}
	public void add(int a, int b, int c ) {
		int d=a+b+c;
		System.out.println("Sum of the given number is "+d);
	}

	public static void main(String[] args) {
		Maths maths = new Maths();
		maths.add(12,56);
	    maths.add(67, 48, 92);

	}

}
