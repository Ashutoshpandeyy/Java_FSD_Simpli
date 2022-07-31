package Simpli_Assignment;

class Product{
    int id = 78;
    String name = "Amul";

    public void display(int id , String name){
        
        System.out.println("Id : " + id + "NAme : "+ name);

    }

}
class A extends Product{
    int count = 50;
    String cat = "butter";
    public void display(){
        System.out.println("Count :" +count + "Category : "+ cat);

    }
}

class B extends Product{
    int count = 90;
    String catg = "Milk";
    @Override
    public void display(int id, String name) {
        // TODO Auto-generated method stub
        super.display(id, name);
    }
}
class C extends Product{
   int count = 56;
   String catg = "chock";
   @Override
   public void display(int id, String name) {
       // TODO Auto-generated method stub
       super.display(id, name);
   }

}

class subA extends A{
    int price = 30;
    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
        int tp = price * count;
        System.out.println("Id : "+id + " NAme: "+name + "Category :" +cat + "Total Price : " +tp);
    }

}

class subB extends B{
    int price = 10;
    @Override
    public void display(int id, String name) {
        // TODO Auto-generated method stub
        super.display(id, name);
    }
}
public class Main {
    
}
