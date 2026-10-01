package Copy;
public class Company {

    //Deep copy

    private String companyName;
    String[] departments;

    Company(String companyName, String[] departments){
        this.companyName = companyName;
        this. departments = new String[]{"AI", "ML", "Design"};

    }
    Company(Company other){
        this.companyName = other.companyName;
        this.departments = other.departments;
    }
    void display(){
        System.out.println("Company Name: "+ companyName);
        for(int i=0; i<departments.length; i++){
            System.out.print(departments[i]+ " ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        Company c1 = new Company("Google", new String[]{"AI", "ML", "Design"});

       

        Company c2 = new Company(c1);
        c2.companyName = "Microsoft";
        c2.departments[0] = "Data";
        c2.display();
        c1.display();

    }


    
}
