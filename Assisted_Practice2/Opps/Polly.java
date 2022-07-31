package Assisted_Practice2.Opps;
class Bank{
    float getIntrest(){
        return 0;
    }
}
class Sbi extends Bank{
    float getIntrest(){
        return 0.4f;
    }
}

class Icici extends Bank{
    @Override
    float getIntrest() {
        return 6.9f;
    }
}

class Hdfc extends Bank{
    float getIntrest(){
        return 7.8f;
    }
}

public class Polly {
    public static void main(String[] args) {
        Bank b; // parents class referenece
        b = new Sbi();  // object of sbi 
        System.out.println("SBI rate of intrest is : " + b.getIntrest());
        b = new Icici(); // objet of Icici
        System.out.println("ICICI rate of intrest is : " + b.getIntrest());
        b = new Hdfc(); // object of HDfc
        System.out.println("HDFC rate of intrest is : " + b.getIntrest());
    }
}
