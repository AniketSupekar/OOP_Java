// This is example of function overloading - complie time 
import java.util.*;
class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name , int age) {
        System.out.println( name + " " + age);
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Aniket";
        s.age = 18;
        s.printInfo(s.name);
        s.printInfo(s.age);
        s.printInfo(s.name , s.age);
    }
}
