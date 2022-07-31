package Project;

import java.util.*;
// import java.util.zip.CheckedInputStream;

public class EmailVal {
    public static boolean check(String[] s ,String email){
        for(int i =0 ; i<s.length; i++){
            String st = s[i];
            if(st.equals(email)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.print("Enter the Employee email Id Avilable : ");
        Scanner scn = new Scanner(System.in);
        String email = scn.nextLine();

        String[] emails = {"ashu188@gmail.com","sam667@gmail.com","akshayraj0132@gmail.com","santo78@gmail.com"};

        boolean sp = check(emails,email);
        if(sp == true){
            System.out.println("This email Id is available ");
        }else{
            System.out.println("This email Id is not available ");
        }
        scn.close();
        // System.out.print("would You like to check again if yes then choose 'y' for No : 'n' : ");
        
        
        

    }

    
}

