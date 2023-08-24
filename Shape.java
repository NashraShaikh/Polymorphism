//RUN TIME POLYMORPHISM
//METHOD OVERRIDING

package com.jsp.polymorphism;

public class Shape {
 
	public static void main(String args[]) {
	    Triangle t = new Triangle();
		t.draw();
		Square s = new Triangle();
		s.draw();
	}
}
