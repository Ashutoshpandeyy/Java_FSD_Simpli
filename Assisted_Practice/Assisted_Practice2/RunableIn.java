package Assisted_Practice2;

// Write a program in Java to create a thread by extending the ‘Thread’ class and by implementing the “Runnable” interface

public class RunableIn implements Runnable{

    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {

        Runnable rn = new RunableIn(); // creating object 
        // creating an object of the class Thread using Thread(Runnable r, String name)  
        Thread th = new Thread(rn,"New thread is created");

        // the start() method moves the thread to the active state  
        th.start();   
  
        // getting the thread name by invoking the getName() method  
        String str = th.getName();  
        System.out.println(str);  

    }
}
