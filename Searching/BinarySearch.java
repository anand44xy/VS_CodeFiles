package Searching;
import java.util.Arrays;

class BinarySearch {
    public static void main(String[] args) {

        int nums[] = {-1, 0, 3, 5, 9, 12};
        Arrays.sort(nums);
        int target = 9;  int left = 0;  int mid;   int right = nums.length - 1;
       
        while (left <= right) {
            mid = left + (right - left) / 2; // Calculate the middle index correctly
            
            if (nums[mid] == target) {
                System.out.println("Target found at index: " + mid);
                return; // Exit the loop since the target is found
            } else if (nums[mid] < target) {
                left = mid + 1; // continue search in right half
            } else {
                right = mid - 1; // continue search in left half
            }
        }
          System.out.println("Target is not found in the given array.");   
    }
}
