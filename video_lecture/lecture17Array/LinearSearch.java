package video_lecture.lecture17Array;

import java.util.Scanner;

public class LinearSearch {
  public static int linearSearch(int[] arr, int n, int x){
    for(int i=0;i<n;i++){
      if(arr[i] == x){
        return i;
      }
    }
    return -1;
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

    System.out.print("Enter Searching Element : ");
    int x = sc.nextInt();

    int idx = linearSearch(arr,n,x);
    System.out.println(idx);


    sc.close();
  }
}
