package assignment.day23;

import java.util.Scanner;

public class SumUniqueEle {

  public static int sumOfUniqueElement(int[] nums, int n){
    int[] arr = new int[101];
    for(int num : nums){
      arr[num]++;
    }

    int ans = 0;
    for(int num : nums){
      if(arr[num] == 1){
        ans += num;
      }
    }

    return ans;
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

    int sum = sumOfUniqueElement(arr,n);
    System.out.println("Sum of Unique Element : "+sum);



    sc.close();
  }
}
