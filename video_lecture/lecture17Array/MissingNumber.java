package video_lecture.lecture17Array;

import java.util.Scanner;

public class MissingNumber {
  public static int missingNum(int[] nums, int n){
    int totalSum = n*(n+1)/2;
    int sum = 0;
    for(int i=0;i<n;i++){
      sum += nums[i];
    }
    return totalSum - sum;
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

    int ans = missingNum(arr, n);
    System.out.println("Missing Number : "+ans);


    sc.close();
  }
}
