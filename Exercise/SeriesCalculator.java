package Exercise;

public class SeriesCalculator {

    public int calculateSum(int n){
        int a = 1;
        int d = 2;

        return (n/2 *(2*a+(n-1)*d));
    }

    public static void main(String[] args){
        SeriesCalculator s1 = new SeriesCalculator();
        System.out.println(s1.calculateSum(10));
    }
    
}
