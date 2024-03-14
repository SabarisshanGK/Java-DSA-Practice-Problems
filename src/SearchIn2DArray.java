import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {

    // color code for displaying output in different colors
    public static final String ANSI_GREEN = "\u001B[32m";
    // Color Reset code to default color
    public static final String ANSI_RESET = "\u001B[0m";


    // Function to find element in 2D array
    static int[] searchElementIn2D( int[][] arr, int target ){
        if (arr.length == 0){
            return new int[]{};
        }
        for ( int row = 0; row < arr.length; row++ ){
            for ( int col = 0; col < arr[row].length; col++ ){
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{};
    }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = {
                {1,3,5},
                {44 ,65,6},
                {20,45,18}
        };

        // Get element to be searched for in the given array from User
        System.out.print("Enter element you want to search for:\t");
        int target = input.nextInt();

        int[] found = searchElementIn2D(array,target);

        if(found.length == 0){
            System.out.println("Sorry Element not found at the given array");
        }
        else {
            for (int i = 0; i < array.length; i++){
                for(int j = 0; j < array[i].length; j++ ){
                    if(i == found[0] && j == found[1]){
                        System.out.print(ANSI_GREEN+array[i][j]+"  "+ANSI_RESET);
                        continue;
                    }
                    System.out.print(array[i][j] +"  ");
                }
                System.out.print("\n");
            }
            System.out.println("Element found at "+ Arrays.toString(found));
        }
    }
}
