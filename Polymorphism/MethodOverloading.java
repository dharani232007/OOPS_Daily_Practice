class Calculator{

    void add(int a, int b){
        System.out.println("Sum of "+ a+ " and " + b+ " is "+ a+b);
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }
}

public class MethodOverloading{

    public static void main(String[] args){

        Calculator c1 = new calculator;
        c1.add(5, 10);
        c1.add(7, 3, 9);
        c1.add(3.89, 8.0778);

    }
}
