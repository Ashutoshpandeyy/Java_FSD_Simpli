package Assisted_Practice1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Vector;

//Writing a program in Java to verify implementations of collections
public class CollectionUse{
    public static void main(String[] args) {
        System.out.println("--- ArrayList -----------");
        ArrayList<String> al = new ArrayList(); // created ArrayList
        al.add("Ashu");
        al.add(":");
        al.add("How");
        System.out.println(al);
        System.out.println(al.size()); // find the size of arrayList
        System.out.println(al.isEmpty());// check list is empty or not 
        System.out.println(al.get(0)); // get the value 
        // for(int i=0;i<al.size();i++)
        // {
        //     System.out.println(al.get(i));
        // }
        System.out.println();
        // foreach Loop
        for(Object i:al)
        {
            System.out.println(i);

        }

        //Created Vector
        System.out.println("-----Vector --------");
        Vector <Integer> v = new Vector();
        v.add(11);
        v.add(45);
        v.add(36);
        System.out.println("Vector Size : "+v.size());
        System.out.println("All Elements are : " + v);

        //creating hashset
        System.out.println("------HashSet-------");
        HashSet<Integer> s=new HashSet<Integer>();  
        s.add(11);  
        s.add(35);  
        s.add(42);
        s.add(73);
        s.add(79);
        System.out.println("Size of HasSet : "+s.size());
        System.out.println("All Elements are : "+s);

     //creating linkedhashset
        System.out.println("--------LinkedHashSet --------");
    
        LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();  
        lhs.add(100);  
        lhs.add(200);  
        lhs.add(300);
        lhs.add(400);	       
        lhs.add(500);
        System.out.println("Size of LinkedHasSet is : " + lhs.size());	       
        System.out.println("Total Elements are : "+lhs);
        

        
    }
}
