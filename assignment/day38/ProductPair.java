package assignment.day38;

import java.util.HashMap;
import java.util.HashSet;
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

  // Optimized code
  public static boolean isProductPair(int[] arr, int n, long x){
    HashSet<Long> mp = new HashSet<>();

    for(int i=0;i<n;i++){
      if(arr[i] == 0){
        if(x == 0) {
          return true;
        } else {
          continue;
        }
      }

      if(x%arr[i] == 0){
        long target = x/arr[i];
        if(mp.contains(target)){
          return true;
        }
      }

      mp.add((long)arr[i]);
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

    // System.out.println(isProduct(arr,n,x));


    System.out.println(isProductPair(arr, n, x));


    sc.close();
  }
}
