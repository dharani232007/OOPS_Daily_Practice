package STATIC;

class Student {

    //Static variable
    String collegeName = "KIT";

    //Non Static variable
    int studentId;
    String name;
    String department;

    //Student constructor
    Student(int id, String name, String dept){
        this.studentId = id;
        this.name = name;
        this.department = dept;
    }

    //static Method
    static void displayCollege(){
        System.out.println("KIT - Kalaignarkarunanidhi Institute of Technology");
    }

    //Non-static Method

    void displayStudent(){
        System.out.println("StudentId: "+studentId);
        System.out.println("Student Name: "+ name);
        System.out.println("Student Department: "+ department);
        displayCollege();

    }
    
}


public class Static{
    public static void main(String[] args){
       Student s1 = new Student(101, "Dharani", "AIML");
       s1.displayStudent();
       Student s2 = new Student(102, "priya", "CSE");
       s2.displayStudent();

       Student.displayCollege();


    }

}


