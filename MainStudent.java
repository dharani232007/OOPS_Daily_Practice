class Student{
    private String name;
    private int rollno;
    private String dept;
    private double cgpa;

    Student(String name, int rollno, String dept, double cgpa){

        this.name = name;
        this.rollno = rollno;
        this.dept = dept;
        this.cgpa = cgpa;
    }

    void displayDetails(){
        System.out.println("Student Name: " + name);
        System.out.println(" Student RollNo: "+ rollno);
        System.out.println("Student department: "+ dept);
        System.out.println("Student CGPA: "+ cgpa);
    }

    void updateCGPA(double cgpa){
        this.cgpa = cgpa;
        System.out.println("Update CGPA: "+ cgpa);
    }
    
    
    
}

public class MainStudent{
        public static void main(String[] args){
        Student s1 = new Student("Dharani", 15, "AIML",8.4 );
        s1.displayDetails();

        s1.updateCGPA(9.0);
    }
}