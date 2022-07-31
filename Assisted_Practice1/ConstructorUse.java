package Assisted_Practice1;

//Writing a program in Java to verify the implementations of constructor types
public class ConstructorUse {
    int a, l, b;
    float r;

    public ConstructorUse() { // Default Constructor

    }

    public ConstructorUse(int a) {  // parameterize constructor
        this.a = a;

    }

    int square() {
        return a * a;
    }

    public ConstructorUse(int l, int b) {
        this.l = l;
        this.b = b;
    }

    int rectangle() {
        return l * b;
    }

    public ConstructorUse(float r) {
        this.r = r;
    }

    float circle() {
        return 3.143f * r * r;
    }
    
   

    public static void main(String[] args) {
        
        ConstructorUse col1 = new ConstructorUse(5);
        ConstructorUse col2 = new ConstructorUse(5, 7);
        ConstructorUse col3 = new ConstructorUse(5.5f);
        
        System.out.println("Area of square is : " + col1.square());
        System.out.println("Area of rectangle is : " + col2.rectangle());
        System.out.println("Area of Circle is : " + col3.circle());
        ;
    }

}
