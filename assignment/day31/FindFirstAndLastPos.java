/*
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
 */

package assignment.day31;

import java.util.Scanner;

public class FindFirstAndLastPos {

  public static int[] searchRange(int[] nums, int target) {
    int st = 0, end = nums.length-1;
    // Find first Index
    int first = -1;
    while(st <= end){
      int mid = st + (end-st)/2;
      if(nums[mid] == target){
        first = mid;
        end = mid-1;
      } else if(nums[mid] < target){
        st = mid+1;
      } else {
          end = mid-1;
      }
    }

    st = 0; 
    end = nums.length-1;
    int last = -1;
    while(st <= end){
        int mid = st + (end-st)/2;
        if(nums[mid] == target){
            last = mid;
            st = mid+1;
        } else if(nums[mid] < target){
            st = mid+1;
        } else {
            end = mid-1;
        }
    }

    return new int[] {first, last};
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int n = sc.nextInt();

    System.out.println("Enter Array Element in Ascending order");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    System.out.print("Enter the target value : ");
    int target = sc.nextInt();
    int[] nums = searchRange(arr, target);
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i]+" ");
    }



    sc.close();
  }
}
