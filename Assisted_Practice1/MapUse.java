package Assisted_Practice1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Writing a program in Java to verify implementations of maps
public class MapUse {
    public static void main(String[] args) {
        // Hash Map
        System.out.println("-------HashMap------------");
        String s = "Ashutosh";
        HashMap hp =  new HashMap<>(); // creating a HasMp
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);  
            if(hp.containsKey(c)){  // check key conatains or not
                int n= 1;
                int o = n+1;
                hp.put(c, o);  // if the key is already in hasmap

            }else{
                hp.put(c, 1); // puted new key
            }
        }


        System.out.println(hp);

              //TreeMap
	    System.out.println("--------TreeMap------------");
	    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	    map.put(101,"Akshay");    
	    map.put(102,"Raj");    
	    map.put(103,"Ranvijay");       
	    map.put(104,"Ayan");       
	    map.put(105,"Ashu");       
	      
	    System.out.println("\nTotal elements of TreeMap  ");  
	    for(Map.Entry l: map.entrySet()){    
	       System.out.println(l.getKey()+" : "+l.getValue());    
	    }         

    }
}
