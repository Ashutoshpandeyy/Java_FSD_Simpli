package Assisted_Practice1;

//Writing a program in Java to verify implementations of regular expressions'
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ReguExp {
    public static void main(String[] args) {
        //removing while space from the String
        String str = "I am Ashutosh pandey writing a java Program. using regular expressions";
        String pattern="[\\s]";
        String replace = "";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        str = m.replaceAll(replace);
        System.out.println(str); 
    }
}
