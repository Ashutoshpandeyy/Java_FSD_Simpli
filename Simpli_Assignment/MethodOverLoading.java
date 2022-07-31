package Simpli_Assignment;

public class MethodOverLoading {
    int add(int a, int b) {
        return a + b;
    }

    int add(long r) {
        float k = 3.147f * r * r;
        return (int) k;
    }

    int add(long l, long b) {
        return ((int) (l * b));
    }

    int add(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        MethodOverLoading mol = new MethodOverLoading();
        System.out.println("sum of two Number is : " + mol.add(10, 20));
        System.out.println("Area of circle is : " + mol.add(8l));
        System.out.println("Area of rectangle is : " + mol.add(20l, 30l));
        System.out.println("Area of square is : " + mol.add(20));
    }
}
