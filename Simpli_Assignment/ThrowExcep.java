package Simpli_Assignment;

import java.util.*;
public class ThrowExcep {
	public static int area(int l ,int b) {
		
			if(l>b) {
				throw new ArithmeticException("length is greater");
			}else {
				
				System.out.println("Both number is correct");
			}
			return l*b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=0;
		Scanner scn = new Scanner(System.in);
		System.out.print("ENter the 1st NUmber :");
		int n = scn.nextInt();
		System.out.println();
		System.out.print("Enter the 2nd Number :");
		int m = scn.nextInt();
		
		try {
			 res = area(n,m);
		}
		catch(ArithmeticException ce) {
			System.out.println(ce.getMessage());
		}
		finally {
			System.out.println("Area of rectangle is : "+res);
		}
		scn.close();

	}

}

