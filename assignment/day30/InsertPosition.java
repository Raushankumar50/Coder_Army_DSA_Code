package assignment.day30;

import java.util.Scanner;

public class InsertPosition {

  public static int searchPosition(int[] arr, int key, int n){
    int idx = n;
    int i = 0, j = n-1;
    
    while(i <= j){
      int mid = i+(j-i)/2;
      if(arr[mid] >= key){
        idx = mid;
        j = mid-1;
      } else {
        i = mid+1;
      }
    }

    return idx;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int n = sc.nextInt();

    System.out.println("Enter Array Element in Ascending Order)");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    
    System.out.print("Enter the key element : ");
    int key = sc.nextInt();

    int idx = searchPosition(arr, key, n);
    System.out.println(idx);


    sc.close();
  }
}
