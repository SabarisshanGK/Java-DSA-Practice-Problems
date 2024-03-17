import java.util.Scanner;

public class SmallestLetter {

    //Function to find Smallest character
    static char smallest( char[] ch , char target){
        int start =0 ;
        int end=ch.length-1;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(target<ch[mid]){
                end = mid-1;
            }
            else {
                start= mid+1;
            }
        }
        return ch[start % ch.length];
    }

    //Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Get size of character array
        System.out.print("Enter size:\t");
        int size = input.nextInt();

        char[] letters = new char[size];

        //Get Array elements from user
        System.out.print("Enter Array elements:\t");
        for (int i = 0; i<size;i++){
            letters[i] = input.next().trim().charAt(0);
        }

        // Get Target element from user
        System.out.print("Enter target character:\t");
        char target = input.next().trim().charAt(0);

        char ans = smallest(letters,target);

        System.out.println("The answer is "+ ans);
    }
}
