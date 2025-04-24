package assignment.day23;

import java.util.Scanner;

public class MoveNegEnd {

  public static void display(int[] arr, int n){
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void moveNegativeElementEnd(int[] arr, int n){
    int[] temp = new int[n];
    int j = 0;
    
    for(int i=0;i<n;i++){
      if(arr[i] >= 0){
        temp[j++] = arr[i];
      }
    }

    for(int i=0;i<n;i++){
      if(arr[i] < 0){
        temp[j++] = arr[i];
      }
    }

    for(int i=0;i<n;i++){
      arr[i] = temp[i];
    }

    display(arr, n);
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

    moveNegativeElementEnd(arr, n);



    sc.close();
  }
}
