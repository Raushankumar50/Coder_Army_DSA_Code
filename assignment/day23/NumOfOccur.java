package assignment.day23;

import java.util.Scanner;

public class NumOfOccur {

  public static int numberOfOccurence(int[] arr, int target){
    int count = 0;
    for(int i=0;i<arr.length;i++){
      if(arr[i] == target){
        count++;
      }
    }
    return count;
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

    System.out.print("Enter a number : ");
    int x = sc.nextInt();

    int count = numberOfOccurence(arr,x);
    System.out.println(count);



    sc.close();
  }
}
