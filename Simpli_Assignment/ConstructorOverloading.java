package Simpli_Assignment;


public class ConstructorOverloading {
    int a, l, b;
    float r;

    public ConstructorOverloading() { // Default Constructor

    }

    public ConstructorOverloading(int a) {
        this.a = a;

    }

    int square() {
        return a * a;
    }

    public ConstructorOverloading(int l, int b) {
        this.l = l;
        this.b = b;
    }

    int rectangle() {
        return l * b;
    }

    public ConstructorOverloading(float r) {
        this.r = r;
    }

    float circle() {
        return 3.143f * r * r;
    }
    //----Method Overloading
    float area(int h, int b) {
        return (h * b) / 2;
    }

    float area(long p, long q) {
        return (p * q) / 2;
    }

    public static void main(String[] args) {
        // C
        ConstructorOverloading col1 = new ConstructorOverloading(5);
        ConstructorOverloading col2 = new ConstructorOverloading(5, 7);
        ConstructorOverloading col3 = new ConstructorOverloading(5.5f);
        // Constructor Overloading
        System.out.println("Area of square is : " + col1.square());
        System.out.println("Area of rectangle is : " + col2.rectangle());
        System.out.println("Area of Circle is : " + col3.circle());
        // Method OverLoading
        ConstructorOverloading col4 = new ConstructorOverloading();
        System.out.println("Area of triangle is : " + col4.area(9, 8));
        System.out.println("Area of rhombus is : " + col4.area(20l, 25l));
    }

}
