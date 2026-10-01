package Inheritance;

class Employee{

    void work(){
        System.out.println("Employee are Working");
    }
}

class Engineer extends Employee{

    void writeCode(){
        System.out.println("Engineer write the code");
    }
}

class Manager extends Employee{
    void ManageProject(){
        System.out.println("Manger is managing the project team");
    }
}

public class HierchicalInheritance {
    public static void main(String[] args){
        Engineer e1 = new Engineer();
        e1.work();
        e1.writeCode();
        Manager m1 = new Manager();
        m1.work();
        m1.ManageProject();
    }
    
}
