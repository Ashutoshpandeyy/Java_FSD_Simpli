package Assisted_Practice2;

interface Interfac1 {
    public default void display(int n) {
        System.out.println("the display() method of Interfac1 invoked");

        if (n % 2 != 0) {
            System.out.println(n +" I am Odd Number");
        } else {
            System.out.println(n+ " I am even number");
        }
    }
}

interface Interface2 {
    public default void display(long n) {
        System.out.println("the display() method of Interface2 invoked");

        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is : " + fact);
    }
}

public class DiamondProb implements Interfac1, Interface2 {
    public void display() {
        Interfac1.super.display(5);
        Interface2.super.display(5l);
    }

    public static void main(String[] args) {
        DiamondProb obj = new DiamondProb();
        obj.display();
    }
}