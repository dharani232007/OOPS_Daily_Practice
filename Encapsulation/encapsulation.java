package Encapsulation;
public class encapsulation {

    static class Student{
        private int marks;
        private String name;
        public String address;

        Student(int marks, String name, String address){

            this.marks = marks;
            this.name = name;
            this.address = address;

        }


        void writeCodes(){
            System.out.println("Student write code");
        }

        void getMarks(){
          System.out.println("Marks: "+ marks);
        }

        void displayData(){
            System.out.println("Marks are: "+ marks);
            System.out.println("Name is: "+ name);
            System.out.println("Address is: "+ address);
        }

        void setMarks(int marks){
            this.marks = marks;
            System.out.println("Mark is updated");
        }

        void setData(String name, int marks, String address){
            this.name = name;
            if(marks >= 0){
                this.marks = marks;
            }
            this.address = address;
        }
    }

    public static void main(String[] args){
        Student s1 = new Student(60, "Amit", "Coimbatore");

        s1.displayData();
        s1.setData("Dharani", 20, "Madurai");
        s1.displayData();
    }
    
    
}
