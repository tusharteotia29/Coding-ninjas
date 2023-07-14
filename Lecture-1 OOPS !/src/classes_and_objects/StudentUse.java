package classes_and_objects;

import java.util.Scanner;

public class StudentUse {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // Student s1=new Student();
        // s1.name="Tushar";
        // s1.setRollnumber(121);

        Student s1 = new Student("Tushar", 123);
        s1.print();


        // Student s2=new Student();
        // s2.name="teotia";
        // s2.setRollnumber(123);

        Student s2 = new Student("teotia", 121);
        s2.print();


        // System.out.println(s1);
        // System.out.println(s1.name);
        // System.out.println(s2.name);
        // System.out.println(s1.getRollNumber());

        
    }
     
    
}
