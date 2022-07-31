package Assisted_Practice1;

//Writing a program in Java to verify implementations of methods and ways of calling a method 

public class MethodCalling {
    public static void fact(int n){  // creating mathod
        int fact = 1;
        for(int i = 2; i<=n; i++){
            fact= fact*i;
        }
        System.out.println("Factoria of "+n+" is : " + fact);
    }
    boolean evnod(int n){
        if(n % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        fact(5); // calling the method by value;
        MethodCalling mc = new MethodCalling();
        boolean k = mc.evnod(7); // callin the method using object
        if(k==true){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
