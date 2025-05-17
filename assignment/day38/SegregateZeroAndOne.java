package assignment.day38;

import java.util.Scanner;

public class SegregateZeroAndOne {

  public static void swap(int st, int end, int[] nums){
    int temp = nums[st];
    nums[st] = nums[end];
    nums[end] = temp;
  }

  public static void segregate(int[] nums, int n){
    int st = 0, end = nums.length-1;
    while (st < end) {
      while (st<end && nums[st] == 0) {
        st++;
      }
      while (st<end && nums[end] == 1) {
        end--;
      }
      swap(st,end,nums);
      st++;
      end--;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int n = sc.nextInt();

    System.out.println("Enter Array Element 0 and 1");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    segregate(arr, n);
    for(int num : arr){
      System.out.print(num+" ");
    }


    sc.close();
  }
}
