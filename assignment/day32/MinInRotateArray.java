package assignment.day32;

import java.util.Scanner;

public class MinInRotateArray {

  public static int findMin(int[] arr, int n){
    int minEle = arr[0];
    int st = 0, end = n-1;
    while(st <= end){
      int mid = st + (end-st)/2;
      if(arr[mid] >= arr[0]){
        st = mid+1;
      } else {
        minEle = arr[mid];
        end = mid-1;
      }
    }
    return minEle;
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

    int minEle = findMin(arr, n);
    System.out.println(minEle);


    sc.close();
  }
}
