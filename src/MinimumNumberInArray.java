import java.util.Scanner;

public class MinimumNumberInArray {

    // Function to find minimum number in an array given by User
    static int minValue( int[] arr ){
        int min = arr[0];
        for ( int i = 1; i < arr.length; i++ ){
            if( arr[i] < min){
                min = arr[i];
            }
        }
        return  min;
    }

    // Main Function
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        // Get Array elements from User
        System.out.print("Enter Array Elements:\t");
        for ( int i =0; i < 5; i++ ){
            array[i] = input.nextInt();
        }

        int min = minValue(array);

        // Print Minimum Value
        System.out.println("The minimum value in given Array is "+min);
    }
}
