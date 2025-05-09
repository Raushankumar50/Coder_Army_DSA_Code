package assignment.day31;

import java.util.Scanner;

public class CountOne {

  public static int countOne(int[] arr, int n){
    int idx = -1;
    int st = 0, end = n-1;

    while(st <= end){
      int mid = st + (end-st)/2;
      if(arr[mid] == 1){
        idx = mid;
        st = mid+1;
      } else {
        end = mid -1;
      }
    }

    if(idx == -1) {
      return 0;
    }
    return idx+1;
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


    int count = countOne(arr,n);
    System.out.println("Number of Ones are : "+count);

    sc.close();
  }
}
