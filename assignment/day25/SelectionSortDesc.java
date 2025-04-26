package assignment.day25;

import java.util.Scanner;

public class SelectionSortDesc {

  public static void display(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void sortDesc(int[] arr, int n){
    for(int i=0;i<n-1;i++){
      int max_idx = i;
      for(int j=i+1;j<n;j++){
        if(arr[j] > arr[max_idx]){
          max_idx = j;
        }
      }

      int temp = arr[i];
      arr[i] = arr[max_idx];
      arr[max_idx] = temp;
    }

    display(arr);
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

    sortDesc(arr, n);



    sc.close();
  }
}
