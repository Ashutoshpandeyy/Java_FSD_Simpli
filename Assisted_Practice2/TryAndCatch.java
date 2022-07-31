package Assisted_Practice2;

public class TryAndCatch{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		int n1=0;
		int n3; 
		try {
			n3 = n/n1;
			System.out.println("Division is  : "+ n3);
		}
//		catch(ArithmeticException ae) {
//			System.out.println("Can't devided by Zero");
//		}
		catch(Exception ae1) {
			System.out.println("I am befor the subclass exception");
			System.out.println(ae1.getMessage());
		}
		finally {
			n3 = n+n1;
			System.out.println("Sum is : "+n3);
			System.out.println("FInally block always executed");
		}
		
				

	}

}

