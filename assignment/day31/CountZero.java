package assignment.day31;

import java.util.Scanner;

public class CountZero {

  public static int countZero(int[] arr, int n){
    int idx = -1;
    int st = 0, end = n-1;

    while(st <= end){
      int mid = st + (end-st)/2;
      if(arr[mid] == 0){
        idx = mid;
        end = mid-1;
      } else {
        st = mid+1;
      }
    }

    if(idx == -1) return 0;
    return n-idx;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int n = sc.nextInt();

    System.out.println("The array is sorted in such a manner that all the 1's are placed first and then they are followed by all the 0's.");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }


    int count = countZero(arr,n);
    System.out.println("Number of Zeroes are : "+count);

    sc.close();
  }
}
