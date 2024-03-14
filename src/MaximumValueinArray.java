import java.util.Scanner;

public class MaximumValueinArray {

    // Function to find maximum value in the given array
    static int maxValue( int[] arr ){
        int max = arr[0];
        for( int i = 1; i < arr.length; i++ ){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        // Get array elements from User
        System.out.print("Enter array elements:\t");
        for ( int i = 0; i < 5; i++ ){
            array[i] = input.nextInt();
        }

        int max = maxValue(array);

        // Print Maximum value to the user
        System.out.println("The maximum value in the given array is "+max);
    }
}
