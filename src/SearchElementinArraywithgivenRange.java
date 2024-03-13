import java.util.Scanner;

public class SearchElementinArraywithgivenRange {
    // Function to search for specified element within specific range given by user
    static int SearchRange(int[] arr, int start,int end, int element){
        if(arr.length == 0){
            return  -1;
        }
        for(int index = start; index <= end; index++){
            if(arr[index] == element){
                return index;
            }
        }
        return -1;
    }

    // Main Function
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        // Get Array Elements from user
        System.out.print("Enter Array Elements:\t");
        for (int i =0; i < 5; i++){
            array[i] = input.nextInt();
        }

        // Get Element to be Searched for
        System.out.print("Enter Element to be searched for in the given array:\t");
        int target = input.nextInt();

        //Get range from User
        System.out.print("Enter the starting range:\t");
        int start_range = input.nextInt();
        System.out.print("Enter the ending range:\t");
        int end_range = input.nextInt();

        int found = SearchRange(array,start_range,end_range,target);

        if(found == -1){
            System.out.println("Element you have specified is not found in the specified range");
        }
        else {
            System.out.println("Element found at position "+ found);
        }
    }
}
