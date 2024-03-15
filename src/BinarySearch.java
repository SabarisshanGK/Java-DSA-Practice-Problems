import java.util.Scanner;

public class BinarySearch {
    // Function to find index of target element through Binary Search Algorithm
    static int binarySearchIndex( int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while ( start <= end ){
            int mid = start+(end-start)/2;
            if(arr[mid] < target){
                start = mid +1;
            }
            else if(arr[mid]>target){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return  -1;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2,3,5,6,7,9};

        // Get Element to be searched from User
        System.out.print("Enter Element you want to search for:\t");
        int target = input.nextInt();

        int found = binarySearchIndex(arr,target);

        if(found == -1){
            System.out.println("Sorry Element not found!");
        }
        else {
            System.out.println("Element at found at index: "+found);
        }
    }
}
