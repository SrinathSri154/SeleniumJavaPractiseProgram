package com.selenium.practise;

public class SwappingNumbers {
	
	public static void swapping(int a, int b) {
	
	
	System.out.println("Before swapping : a =" + a + " b =" + b);
	
	// with third variable
	
//	int c;
//	
//	c = a;
//    a = b;
//    b = c;
//    
//	System.out.println("After swapping : a =" + a + " b =" + b);
//	
	
	// without third variable
	
	a = a + b; //3
	b = a - b;  // 1
	a = a - b; //2
	
	System.out.println("After swapping : a =" + a + " b =" + b);


	
	}
	public static void main(String[] args) {

		swapping(100,-1000);
		
	}

}
