package Exercise;

//Create a class Biggest that contains a single-dimensional array as a data member and a method display() to find and display the largest element of the array.

public class SingleDimensionalArray {

   
    
    int[] arr = {5,6,2,7,1,8,1};

    public int display(){
        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        SingleDimensionalArray s1 = new SingleDimensionalArray();
        System.out.println("Largest number: " + s1.display());

    }


    
}
