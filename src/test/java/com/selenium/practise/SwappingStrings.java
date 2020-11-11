package com.selenium.practise;

public class SwappingStrings {
	
	public static void Swapping(String str1, String str2) {
		
		System.out.println("Before swapping strings : str1 = " + str1 + " Str2 = " + str2);
		
		str1 = str1 + str2; //JavaPython 
		str2 = str1.substring(0, str1.length()-str2.length()); // Java
		str1 = str1.substring(str2.length());
		
		
		//System.out.println(str1);

		//System.out.println(str2);
		System.out.print("After swapping : Str1 = " + str1 + " Str 2 =" + str2);
		
	}
	

	public static void main(String[] args) {
		
		Swapping("11", "12");

	}

}
