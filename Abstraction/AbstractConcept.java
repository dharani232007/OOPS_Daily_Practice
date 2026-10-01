package Abstraction;

abstract class Employee{
    void work(){

    }
}

class Teacher extends Employee{
    void work(){
        System.out.println("Teaching the subject for student");
    }
}

class Engineer extends Employee{
    void work(){
        System.out.println("Engineer write codes");
    }
}

public class AbstractConcept {

    public static void main(String[] args){
        Employee e1 = new Teacher();
        e1.work();
    }



    
}
