package assignment.day31;

import java.util.Scanner;

public class KthMissingElement {

  public static int findKthPositive(int[] arr, int k) {
    int start = 0, end = arr.length-1;
    int ans = arr.length;
    while(start <= end){
      int mid = start+(end-start)/2;
      if(arr[mid]-mid-1 >= k){
        ans = mid;
        end = mid-1;
      } else 
          start = mid+1;
      }
      return ans+k;
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

    int num = findKthPositive(arr, 2);
    System.out.println(num);

    sc.close();
  }
}
