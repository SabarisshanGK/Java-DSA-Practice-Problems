import java.util.Scanner;

public class NormalLinearSearchAlgorithm {

    //Function to find elements in Array with normal Linear Search Algorith with Time Complexity of O(N)
    static int LinearSearch(int[] arr, int element) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == element) {
                return index;
            }
        }
        return -1;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        // Get Array values from User
        System.out.print("Enter Array Elements:\t");
        for (int i =0 ;i<arr.length;i++){
            arr[i] = input.nextInt();
        }

        // Get Element to be searched in the given array
        System.out.print("Enter the element you want to search in the array:\t");
        int element = input.nextInt();

        int found = LinearSearch(arr,element);

        if(found == -1){
            System.out.println("The element you have entered is not found in the given array");
        }

        else {
            System.out.println("The element is found at position "+found +" in the given array");
        }
    }
}
