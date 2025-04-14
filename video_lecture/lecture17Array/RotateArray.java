package video_lecture.lecture17Array;

import java.util.Scanner;

public class RotateArray {
  public static void display(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void rotate(int[] nums, int i, int j){
    while(i < j){
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
      i++; j--;
    }
  }
  public static void rotateArray(int[] nums, int n, int k){
    k = k%n;

    rotate(nums,0,n-k-1);
    rotate(nums, n-k, n-1);
    rotate(nums, 0, n-1);

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

    System.out.print("Enter Rotate Position : ");
    int k = sc.nextInt();
    rotateArray(arr, n, k);



    
    sc.close();
  }
}

