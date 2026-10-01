
// Class 1: Independent Student Class (Outside Main)
class Student {
    String Name;
    String dept;
    int mark;
    boolean isPresent;

    Student(){
        System.out.println(" Default Constructor called");
        Name = "Meena";
        dept = "AYUSH";
        mark = 1000;
        isPresent = false;
    }

    

    void Study() {
        System.out.println("Student is studying");
    }

    void print() {
        System.out.println("Student Name: " + this.Name);
        System.out.println("Student department: " + this.dept);
        System.out.println("Student mark: " + this.mark);

        this.Study();
    }
}

// Class 2: Main Wrapper Class
public class Main {
    public static void main(String[] args) {
        Student st = new Student(); // This will work perfectly now!
        // st.Name = "Dharani";
        // st.dept = "AIML";
        // st.mark = 98;
        // st.isPresent = true;
        st.print();
    }
}
