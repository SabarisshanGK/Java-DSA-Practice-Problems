import java.util.ArrayList;
import java.util.Scanner;

public class SearchCharacterInString {
    // Function to search specific character in given string
    static ArrayList<Integer> SearchCharacter( String str, char target){
        ArrayList<Integer> searchIndex = new ArrayList<Integer>();
        String strCopy = str.toLowerCase();
        // To check edge case whether string has length equal to 0
        if(str.length() ==  0){
            return searchIndex ;
        }
        // To iterate through the string and store the indexes found in searchIndex arrayList
        for(int index = 0; index < str.length(); index++){
            if(strCopy.charAt(index) == target){
                searchIndex.add(index);
            }
        }
        // If above for loop doesn't find character means searchIndex returns size 0, otherwise it return size more tha zero
        return  searchIndex;
    }

    // Main Function
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Get a String from User
        System.out.print("Enter String:\t");
        String str = input.next();

        //Get a character to be searched in given string
        System.out.print("Enter a character to be searched in the given string:\t");
        char ch = input.next().trim().charAt(0);

        ArrayList<Integer> found = SearchCharacter(str,ch);
        int size = found.size();

        if( size == 0){
            System.out.println("The character you have searched for is not found in the given string");
        }
        else {
            System.out.println("The character you have searched for is found at the position "+found+" in the given string");
        }
    }
}
