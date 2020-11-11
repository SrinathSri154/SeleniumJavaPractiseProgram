package com.selenium.practise;

public class printingpairs {
	
	public static void printpairs() {
		
		int a[] = {1,2,-3,6,0,3};
		int sum = 3;
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<i; j++)

			if (a[i] + a[j] == sum)
				
			{
				System.out.println("pairs are :"+ (+ a[i] +" , "+ a[j]) );
				
				//System.out.println("pairs are :" + a[i] + a[j] );

			}
			
			
		}
		
		
	}

	public static void main(String[] args) {
		
		

		printpairs();
	}

}
