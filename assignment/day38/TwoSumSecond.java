package assignment.day38;

import java.util.Scanner;

public class TwoSumSecond {

  public static int[] twoSum(int[] nums, int n, int target){
    int left = 0, right = n-1;
    while(left < right){
      if(nums[left]+nums[right] == target){
        return new int[] {left+1, right+1};
      } else if(nums[left]+nums[right] < target){
        left++;
      } else {
        right--;
      }
    }
    return new int[] {-1,-1};
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int n = sc.nextInt();

    System.out.println("Enter Array Element in Increasing order or circular order");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    System.out.print("Enter a target value : ");
    int target = sc.nextInt();

    int[] ansArr = twoSum(arr, n, target);
    for(int idx : ansArr){
      System.out.print(idx+" ");
    }


    
    sc.close();
  }
}
