package GetterSetter;

public class Employe {

    private String Name;
    private String Role;
    private int Salary;

    Employe(String name){
        this.Name = name;
    }
    Employe(String name, String role){
        this.Name = name;
        this.Role = role;
    }
    Employe(String name, String role, int salary){
        this.Name = name;
        this.Role = role;
        this.Salary = salary;
    }

    public  void printEmploye(){
        System.out.println(this.Name);
        System.out.println(this.Role);
        System.out.println(this.Salary);
    }

    public int getSalary(){
        return this.Salary;
    }

    public void setSalary(int x){
        if(x >0){
            this.Salary = x;
        }
    }
    
}


