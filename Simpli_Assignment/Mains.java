package Simpli_Assignment;

//2 abstract methods + 1 constructor + 1 normal method
//Infosys (child of MNC) ----> make it abstract also  but give the implementation/method body of single abstarct method
//Hello (child of Infosys) ----> here implement all the abstarct methods + 1 create normal method also
//main class ---> call all the methods of all classes using the dynamic polymorphism




abstract class MNC {
	MNC(){
		System.out.println("I am Constructor of MNC Class");
	}
	abstract void servic();
	abstract void simp();
	void run() {
		System.out.println("I am method inside the MNC");
	}
	
	
}

abstract class Infosys extends MNC{
	abstract void inf();

	void service() {
		System.out.println("I am method of  Infosys class");
	}
}

class Hello extends Infosys{
	void servic() {
		System.out.println("Multi National Company");
	}
	void simp() {
		System.out.println("Working on Mnc Comp.");
	}
	void inf() {
		System.out.println("Workin In Infosys");
	}
	
	public void sho() {
		System.out.println("I am method of Hello class");
	}
}
	




public class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Infosys mn = new Hello();
		mn.servic();
		mn.simp();
		mn.inf();
		((Hello) mn).sho();
		
		

	}

}
