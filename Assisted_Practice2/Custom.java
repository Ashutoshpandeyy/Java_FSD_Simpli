package Assisted_Practice2;


// package Assisted_Practice2;
import java.util.Scanner;

public class Custom{
	public static void checking(int sal)throws InvalidSalException {
		if(sal < 2100) {
			throw new InvalidSalException("You need to work hard");
		}else if(sal > 2100) {
			throw new InvalidSalException("Your salary somehow good");
		}else if(sal > 5100 ) {
			throw new InvalidSalException("Your salary is very good");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your Salary : ");
		int n = scn.nextInt();
		try {
			checking(n);
		}
		catch(Exception sc) {
			System.out.println(sc.getMessage());
		}
		finally {
			System.out.println("I am Finally block");
		}
		scn.close();

	}	
}	
class InvalidSalException extends Exception{
		/**
	 * 
	 */
	// private static final long serialVersionUID = 1L;
		
	InvalidSalException(String s) {
		super(s);
	}
		
}

	
