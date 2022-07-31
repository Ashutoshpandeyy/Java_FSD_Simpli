package Assisted_Practice2.Opps;

class Product{
	int id = 78;
	String name =  "Amul";
	void display(){
		System.out.println("Id : "+id + " Name : " + name);
	}
}

class A extends Product{

	int count = 50;
	String cat = "Butter";
	void display() {
		System.out.println("Count : "+count + " Category : "+cat + " ID : " +id + " Name : "+name);
	}
}

class B extends Product{

	int count = 90;
	String cat = "Milk";
	void display() {
		System.out.println("Count : "+ count + " Category : " + cat + " ID : "+id + " Name : "+name);
	}
	
}

class C extends Product{

	int count = 56;
	String cat = "Choko";
	void display() {
		System.out.println("Count :"+count +  " Category : " +cat + " ID : "+id +" Name : "+name);
	}
}

class SubA extends A{
	int price = 30;
	int total = price*count;
	void show(){
		System.out.println("ID : "+ id + " Name : "+name + " Category : "+cat +" Price : "+total);
	}
	
}

class SubB extends B{
	int price = 10;
	int total = price * count;
	void show(){
		System.out.println("ID : "+ id + " Name : "+name + " Category : "+cat +" Price : "+total);
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pd = new Product();
		pd.display();
		A a = new A();
		a.display();
		B b = new B();
		b.display();
		C obj3 = new C();
		obj3.display();
		SubA obj1 = new SubA();
		obj1.show();
		SubB obj2 = new SubB();
		obj2.show();
	

	}

}
