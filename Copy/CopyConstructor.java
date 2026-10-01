package Copy;
public class CopyConstructor { 
    static class Student { 
        int mark; 
        String name; 

        // Default Constructor
        Student() { 
            mark = 50; 
            name = "dharani"; 
        } 

        // Copy Constructor
        Student(Student other) {
            this.mark = other.mark;
            this.name = other.name;
        }

        void study() { 
            System.out.println("student is studying"); 
        } 
    } 

    public static void main(String[] args) { 
        Student s1 = new Student(); // Uses default constructor
        
        // This is a reference copy, NOT a copy constructor.
        // Both s1 and s2 point to the exact same object in memory.
        Student s2 = s1; 
        
        // This uses the copy constructor.
        // s3 is a brand new, independent object with the same data.
        Student s3 = new Student(s2); 
    } 
}
