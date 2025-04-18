package assignment.day22;

import java.util.Scanner;

public class SumOfElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int n = sc.nextInt();

    System.out.println("Enter Array Element");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    int sum = 0;
    for(int i=0;i<n;i++){
      sum += arr[i];
    }

    System.out.println("Sum of Array Element : "+sum);



    sc.close();
  }
}
