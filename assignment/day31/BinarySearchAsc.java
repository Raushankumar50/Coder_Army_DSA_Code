package assignment.day31;

import java.util.Scanner;

public class BinarySearchAsc {

  public static int bnSearch(int[] arr, int target, int n){
    int st = 0, end = n-1;

    while(st <= end){
      int mid = st + (end-st)/2;
      if(arr[mid] == target){
        return mid;
      } else if(arr[mid] > target){
        end = mid-1;
      } else {
        st = mid+1;
      }
    }
    return -1;
  }

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int n = sc.nextInt();

    System.out.println("Enter Array Element in Assending Order)");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    int target = sc.nextInt();
    System.out.print("Enter the target element : ");

    int idx = bnSearch(arr, target, n);
    System.out.println(idx);



    sc.close();
 } 
}
