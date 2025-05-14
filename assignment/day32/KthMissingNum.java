package assignment.day32;

import java.util.Scanner;

public class KthMissingNum {

  public static int findNum(int[] arr, int k){
    int ans = arr.length;
    int st = 0, end = arr.length-1;

    while (st <= end) {
      int mid = st + (end-st)/2;
      if(arr[mid]-mid-1 >= k){
        ans = mid;
        end = mid-1;
      } else {
        st = mid+1;
      }
    }

    return ans+k;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int n = sc.nextInt();

    System.out.println("Enter Array Element in strictly increasing order");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    int num = findNum(arr, 2);
    System.out.println(num);

    sc.close();
  }
}
