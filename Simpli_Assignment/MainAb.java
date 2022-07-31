package Simpli_Assignment;

abstract class Vechile{
	abstract void run();
	abstract void stop();
	
	public void fuel(int l) {
		System.out.println("Total Fuel is : "+l);
	}
	 public void fuel(float d, String name) {
		 System.out.println("Distance is : " + d + " Vechile Name : "+name);
	 }
	 public void fuel(char c,int no) {
		 System.out.println("Color is : "+c + " Vechile Number is : "+no);
	 }
	 
	 int speed;
	 long dist;
	 Vechile(int speed, long dist){
		 this.speed = speed;
		 this.dist = dist;
		 System.out.println("Speed : "+speed + " Distance "+ dist);
	 }
	 Vechile(){
		 System.out.println("Calling the default Constructor");
	 }
	 
	 Vechile(int a, int b)
	 {
		 speed = a;
		 dist = b;
	 }
	protected abstract void display();
}

class Bike extends Vechile{
	
	@Override
	void run() {
		System.out.println(" I am runnig Method");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println(" I am runnig Method");
		
	}
	Bike(){
		System.out.println("I an Defaul Construcor of Bike class");
	}
	
	Bike(int a, int b){
		super(a,b);
	}
	
	int speed = 90;
	long dist = 400;
	int not = 2;
	
	
	
	protected void display() {
		System.out.println("Speed : "+90+ " Distance :"+dist + " No of tirs : "+not);
	}
}

public class MainAb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vechile vc = new Bike(100,300);
		vc.fuel(9);
		vc.fuel(100.5f,"Maruti");
		vc.fuel('R', 2435);
		vc.run();
		vc.stop();
		vc.display();
		

	}

}

