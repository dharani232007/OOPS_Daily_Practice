package STATIC;

public class staticVariable {

    static class Student{
        static String collegeName = "KIT";
        String name;
        int age;
        String Dept;

        Student(String Name, int Age, String dept){
            this.name = Name;
            this.age = Age;
            this.Dept = dept;
        }

        void print(){
            System.out.println(" Student Name: "+ name);
            System.out.println("Student Age: "+ age);
            System.out.println("Student department: "+ Dept);

        }
    }

    public static void main(String[] args){
        Student s1 = new Student("Dharani", 19, "AIML");
        Student s2 = new Student("Anu", 10, "CSE");
        Student s3 = new Student("Meena", 18, "AYSUH");

        s1.print();
        s2.print();
        s3.print();


        
    }
    
}

//javac STATIC/staticVariable.java
// java STATIC.staticVariable 
