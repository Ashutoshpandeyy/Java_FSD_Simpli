package Assisted_Practice1;

//Write a program to create strings and display the conversion of string to StringBuffer and StringBuilder.
public class StrConversion {
    
    public static void main(String[] args) {
        String[] st = {"jai","ho", "hare", "ram"};
        StringBuilder sb =  new StringBuilder(); // string builder
        sb.append(st[0]);   // append value in stringBuilder
        sb.append(st[1]);
        sb.append(st[2]);
        sb.append(st[3]);
        System.out.println(sb.capacity());// find capcity of stringBuilder
        System.out.println(sb.toString()); // conversion stringBuuilder to String
        
        String str = "java";
        StringBuffer s = new StringBuffer(str);  // create StringBuffer;

        System.out.println(s.append("phasel")); // append value in StringBuffer
        System.out.println(s.delete(2, 5));
        System.out.println(s.replace(4, 10, "python"));
        System.out.println(s.insert(4, "language"));
        System.out.println(s.reverse());
        System.out.println(s.charAt(9));

        System.out.println(s.toString()); // conversion StringBuufer to String 

        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb1.equals(sb2));

    }
}
