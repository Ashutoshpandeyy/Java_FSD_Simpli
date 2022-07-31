package Project;

import java.io.BufferedReader;
import java.io.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class FileHandling
{
    public static void main(String args[]) throws FileNotFoundException, IOException {
        System.out.println("Select the options which operation would you like to perform  w for Write r for read file and a append in file: ");
        System.out.println("Write File 'w' :\nRead File 'r' :\nAppend File 'a' : \n");
        System.out.print("Enter the Option : ");
        
        Scanner scn =new Scanner(System.in);
        String s=scn.nextLine();
        if(s.equalsIgnoreCase("r"))
        {
            new FReading();
        }
        else if(s.equalsIgnoreCase("w")||s.equalsIgnoreCase("a"))
        {
            writingToFile(s);
            
            
        }
        else
        {
            System.out.println("Sorry you try to do unexpected ,betterluck next time ");
        }
        
        
        scn.close();
        
    }
    
    public static void writingToFile(String s)
    {
        Scanner scn=null;
        try
        {
            String source = "";
            File f=new File("file1.txt");
            
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            //For writing new Content Everytime you run
            FileWriter f0 =null;
            if(s.equalsIgnoreCase("w"))
            {
                f0 = new FileWriter(f,false);
                System.out.println("CAUTION >> Please understand it will overwrite the content of the file ");
                System.out.println("Type 'no' to exit type 'yes' to proceed : ");
    
                scn=new Scanner(System.in);

                String s1=scn.nextLine();
                if(s1.equals("no"))
                System.exit(0);
                System.out.println("Write 'stop' when you finish writing file ");
                f.delete();
                f.createNewFile();
                while(!(source=bf.readLine()).equalsIgnoreCase("stop")){
                    f0.write(source + System.getProperty("line.separator"));
                    
                }
                
                scn.close();
            }
            //For appending the content
            else
            {  f0 = new FileWriter(f,true);
                System.out.println("Write 'stop' when you finish appending file ");
                while(!(source=bf.readLine()).equalsIgnoreCase("stop")){
                    f0.append(source+ System.getProperty("line.separator"));
                }
            }
            f0.close();
            
        }
        catch(Exception e){
            System.out.println("Error : " );
            e.printStackTrace();
        }
        
        
    }
    
    
    
}

class FReading {
    public static String str="";
    
    public FReading() {
        
        try{
            File f5=new File("file1.txt");
            if(! f5.exists())
            f5.createNewFile();
            FileReader fl=new FileReader(f5);
            BufferedReader bf=new BufferedReader(fl);
            //For reading till end
            while((str=bf.readLine())!=null){
                System.out.println(str);
            }
            fl.close();
            }catch(Exception e){
            System.out.println("Error : " );
            e.printStackTrace();
        }
    }
}
