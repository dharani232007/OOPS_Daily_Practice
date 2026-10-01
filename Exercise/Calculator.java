package Exercise;

//Create a class Calculator with the following methods:
//calculateSum(int number1, int number2) to calculate the sum of two numbers.
//calculateDifference(int number1, int number2) to calculate the difference between two numbers.

public class Calculator {

    int calculateSum(int n1, int n2){
        return n1+n2;
    }

    int calculateDiff(int n1, int n2){
        return n1-n2;
    }

    public static void main(String[] args){
        Calculator add = new Calculator();
        Calculator sub = new Calculator();
        
        System.out.println("Addition: " +add.calculateSum(2,3));
        System.out.println("Subtraction: "+ sub.calculateDiff(2,3));
    }
    
}
