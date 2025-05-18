package assignment.day38;

import java.util.Scanner;

public class ProductPair {

  public static boolean isProduct(int[] arr, int n, long x){
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]*arr[j] == x){
          return true;
        }
      }
    }
    return false;
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

    System.out.print("Enter a value : ");
    long x = sc.nextLong();

    System.out.println(isProduct(arr,n,x));


    sc.close();
  }
}
