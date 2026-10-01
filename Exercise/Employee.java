package Exercise;

//Create a class Employee with overloaded constructors to initialize employee details based on different combinations of arguments. Ensure the constructors support the creation of objects in various ways.
public class Employee {

    String name;
    String role;
    int salary;

    Employee(String Name){
        this.name = Name;
        
    }
    Employee(String Name, String Role){
        this.name = Name;
        this.role = Role;
        
    }
    Employee(String Name, String Role, int Salary){
        this.name = Name;
        this.role = Role;
        this.salary = Salary;
    }


    public static void main(String[] args){
        Employee e1 = new Employee("Dharani");
        Employee e2 = new Employee("Priya", "UI&UX");
        Employee e3 = new Employee("Meena", "Doctor", 100000);

        System.out.println(e1.name);
        System.out.println(e2.name + e2.role);
        System.out.println(e3.name + e3.role + e3.salary);
    }
    
}
