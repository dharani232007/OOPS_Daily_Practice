package GetterSetter; 

public class main_set_get {
    public static void main(String[] args){

        
        Employe e3 = new Employe("Anu", "Speaker", 100000);

        
        System.out.println(e3.getSalary());
        e3.setSalary(200000);
        e3.printEmploye();





    }
    
}
