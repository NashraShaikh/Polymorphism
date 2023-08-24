
//METHOD SHADOWING
package com.jsp.polymorphism;

public class B extends A{
	 public static void m1() {
		 System.out.println("Static member in B");
	 }
	 @Override
	      public void m2() {
	    	  System.out.println("Non static member in B");
	      }
}
