package Assisted_Practice1.AcceessModifier.pkg2;

import Assisted_Practice1.AcceessModifier.pkg1.Modifier;

public class ModifierCheck extends Modifier {
 
    public static void main(String[] args) 
    {
        //public access modifier...........
        Modifier m = new Modifier();           //  public access modifier still available in another pkg..
        m.cllg = "MMDU";

        //private acess modifier...........
        // m.name ="ashish";               //  private access modifier not available in another pkg..    
        
        //protected access modifier........
        location ="patna";          // location is a Modifier pkg Protected access modifier instance
                                    // variable but we can access it through another subsiding class..

        //default access modifier........                
        // m.id = 40;                  // we r unable to access Modifier instance variable 'id'..
                                    // bcz it has default access modifer

       

    }

}