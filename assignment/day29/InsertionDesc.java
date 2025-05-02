package assignment.day29;

import java.util.Scanner;

public class InsertionDesc {

  public static void insertionSortDesc(int[] arr, int n){
    for(int i=1;i<n;i++){
      int j = i;
      while(j>0 && arr[j] > arr[j-1]){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        j--;
      }
    }

    // Display Array
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
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

    insertionSortDesc(arr, n);

    sc.close();
  }
}
