package video_lecture.lecture19_20_21_sorting;

import java.util.Scanner;

public class InsertionSort {
  public static void display(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void insertionSort(int[] arr, int n){
    for(int i=1;i<n;i++){
      int j = i;
      while(j>0 && arr[j]<arr[j-1]){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        j--;
      }
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

    insertionSort(arr, n);


    sc.close();
  }
}
