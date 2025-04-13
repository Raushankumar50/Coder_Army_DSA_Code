package video_lecture.lecture17Array;

import java.util.Scanner;

public class ReverseArray {
  public static void display(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void reverse(int[] arr, int n){
    int i = 0, j = n - 1;
    while(i < j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
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

    reverse(arr, n);

    sc.close();
  }
}
