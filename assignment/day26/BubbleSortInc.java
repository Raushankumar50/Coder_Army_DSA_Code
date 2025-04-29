package assignment.day26;

import java.util.Scanner;

public class BubbleSortInc {

  public static void display(int[] nums){
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i]+" ");
    }
    System.out.println();
  }
  
  public static void bubbleSortInc(int[] arr, int n){
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-i-1;j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    display(arr);
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

    bubbleSortInc(arr,n);

    sc.close();
  }
}
