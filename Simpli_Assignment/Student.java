package Simpli_Assignment;

public class Student {
    String name;
    int age;
    char sec;
    char gen;
    int ms1;
    int ms2;
    int ms3;
    public Student(String name, int a, char s, char g, int m,int m2,int m3){
        this.name = name;
        this.age = a;
        this.sec = s;
        this.gen = g;
        this.ms1 = m;
        this.ms2 = m2;
        this.ms3 = m3;
    }
    void display(){
        int total = ms1 + ms2 + ms3;
        float percent = (total * 100)/300;
        System.out.println("Name : "+name + " Age : "+age + " Section : " + sec + " Gender : " + gen+" TotalMarks : " + total + " Percentage :" + percent);
    }
    public static void main(String[] args) {
        //Creating object of Student Class
        Student s1 = new Student("Raj", 25, 'A', 'M', 87, 87, 97);
        Student s2 = new Student("Jaya", 23, 'B', 'F', 0, 70, 72);
        Student s3 = new Student("Akshay", 26, 'C', 'M', 0, 87, 90);
        Student s4 = new Student("Raju", 27, 'A', 'M', 80, 81, 67);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
    
    
}