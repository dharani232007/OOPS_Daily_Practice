class Student{
    String name;
    int rollNo;
    String Gender;

    void student(){
        System.out.println("I am studying");
    }
}

class Male{

    void male(){
        System.out.println("He is a Male Student");
    }

}
class Female{

    void female(){
        System.out.println("She is a Female Student");
    }

}

class Boy extends Student, Male{
    void boy(){
        System.out.println("I am a boy");
    }
}

class Girl extends Student, Female{

    

    void girl(){
        System.out.println("I am a girl");
    }

}


public class HybridInheritance{
    public static void main(String[] args){

        student s1 = new Student();
        Boy b1 = new Boy();
        b1.boy();
        b1.student();

        Girl g1 = new Girl();
        g1.girl("Dharani", 100, "Female");
        g1.student()



    }
}