// Program to display count of even number of digits in an array

import java.util.Scanner;

public class EvenNumberOfDigits {

    //Function to find count of even number of digits in an array
    static int findCountEvenDigits( int[] arr ){
        int count = 0;
        for (int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //Function to find even number of digits
    static boolean even(int num){
        int noOfDigits = TotalDigits(num);
        if(noOfDigits % 2 == 0){
            return  true;
        }
        return false;
    }

    // Function to find total number of digits
    static int TotalDigits(int num){
        int digit = 0;
        if(num < 0){
            num= num * -1;
        }
        if(num == 0){
            return 1;
        }
        while (num > 0){
            digit++;
            num = num/10;
        }
        return  digit;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        // Get array values from user
        System.out.print("Enter array elements:\t");
        for (int i =0 ;i < 5;i++ ){
            array[i] = input.nextInt();
        }

        int count = findCountEvenDigits(array);

        // Print count to the user
        System.out.println("There are total of "+count+" counts of even number of digits");
    }


}
