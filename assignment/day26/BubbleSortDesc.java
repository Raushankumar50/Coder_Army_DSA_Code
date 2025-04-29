package assignment.day26;

import java.util.Scanner;

public class BubbleSortDesc {
  public static void display(int[] nums){
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i]+" ");
    }
    System.out.println();
  }

  public static void bubbleSortDesc(int[] nums, int n){
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-i-1;j++){
        if(nums[j] < nums[j+1]){
          int temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
        }
      }
    }

    display(nums);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int n = sc.nextInt();

    System.out.println("Enter Array Element");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    bubbleSortDesc(arr, n);


    sc.close();
  }
}
