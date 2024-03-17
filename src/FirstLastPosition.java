import java.util.ArrayList;
import java.util.Arrays;

public class FirstLastPosition {
    // Function to find first and last position
    static int[] findPositions(int[] arr, int target ){

        int[] ans = {-1,-1};

        int start = search(arr,target,true);
        int end = search(arr,target,false);

        ans[0]= start;
        ans[1] = end;

        return ans;

    }
    static int search(int[] arr, int target, boolean isStart){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start = start+1;
            }
            else if(arr[mid] > target){
                end -=1;
            }
            else{
                ans = mid;
                if(isStart){
                    end = mid -1;
                }
                else{
                start = mid+1;
                }
            }

        }
        return ans;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1,5,5,5,5,5,8,10};
        int target = 5;


        int[] ans = findPositions(arr,target);

        System.out.println(Arrays.toString(ans));
        System.out.println("First Position: "+ans[0]+"\nSecond Position: "+ans[1]);
    }
}
