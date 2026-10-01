public class Ticked {

    String movieName;
    static int totalTickedsSold = 0;

    void bookTicket(String name){
        movieName = name;
        totalTickedsSold++;
        System.out.println("Ticked booked for "+ movieName);
    }

    public static void main(String[] args){
        Ticked t1 = new Ticked();
        t1.bookTicket("parimala and co");
        Ticked t2 = new Ticked();
        t2.bookTicket("RRR");
        System.out.println(Ticked.totalTickedsSold);
    }
    
}

