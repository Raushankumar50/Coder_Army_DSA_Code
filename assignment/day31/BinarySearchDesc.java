package assignment.day31;

import java.util.Scanner;

public class BinarySearchDesc {

  public static int binarySearch(int[] arr, int target, int n){
    int low = 0, high = n-1;
    while(low <= high){
      int mid = low + (high-low)/2;
      if(arr[mid] == target){
        return mid;
      } else if(arr[mid] > target){
        low = mid+1;
      } else {
        high = mid-1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int n = sc.nextInt();

    System.out.println("Enter Array Element in Desending Order)");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    int target = sc.nextInt();
    System.out.print("Enter the target element : ");

    int idx = binarySearch(arr, target, n);
    System.out.println(idx);



    sc.close();
  }
}
