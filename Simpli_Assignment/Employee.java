package Simpli_Assignment;

public class Employee {
	int salary =1000;
	class InnerClass{
		String code = "PE01";
		float hike = .45f;
		void newSal() {
			float nSal = salary + (salary*hike);
			System.out.println("New Salary after hike : "+nSal);
		}
		void display() {
			System.out.println("Salary : "+salary + " Code : "+code + " Hike : "+hike);
		}
		
	}
	class InClass{
		int sal = salary;
		String code = "TE01";
		float hike = .30f;
		void newSal() {
			float nsal = sal + (sal*hike);
			System.out.println("New salary after hike : "+nsal);
		}
		void display() {
			System.out.println("Salary : "+sal + " Code "+code + " hike "+ hike);
		}
	}
	void role() {
		System.out.println("Inside the Outer Method");
		class LocalClass{  /// Local InnerClass
			int s = salary;
			String code = "CE01";
			float hike =.30f;
			void newsal() {
				float nsal = s + (s*hike);
				System.out.println("New salary after hike : "+nsal);
			}
			void display() {
				System.out.println("Salary : "+s + " Code "+code + " hike "+ hike);
			}
			
			
		}
		LocalClass lc = new LocalClass();
		lc.newsal();
		lc.display();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		Employee.InnerClass ic = emp.new InnerClass();
		ic.newSal();
		ic.display();
		Employee.InClass icc = emp.new InClass();
		icc.newSal();
		icc.display();
//		
		emp.role();

	}

}
