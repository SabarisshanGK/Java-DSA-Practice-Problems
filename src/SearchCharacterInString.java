import java.util.ArrayList;
import java.util.Scanner;

public class SearchCharacterInString {
    // Function to search specific character in given string
    static ArrayList<Integer> SearchCharacter( String str, char target){
        ArrayList<Integer> searchIndex = new ArrayList<Integer>();
        String strcopy = str.toLowerCase();
        if(str.length() ==  0){
            return searchIndex ;
        }

        for(int index = 0; index < str.length(); index++){
            if(strcopy.charAt(index) == target){
                searchIndex.add(index);
            }

        }
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
