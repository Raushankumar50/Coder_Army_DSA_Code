package video_lecture.lecture17Array;

import java.util.Scanner;

public class SecondMax {
  public static int secondMax(int[] arr, int n){
    int max = Integer.MIN_VALUE, secMax = Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      if(max < arr[i]){
        secMax = max;
        max = arr[i];
      } else if(arr[i]>secMax && arr[i]<max){
        secMax = arr[i];
      }
    }
    return secMax;
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

    int secMax = secondMax(arr, n);
    System.out.println("Second Max is : "+secMax);
    

    sc.close();
  }
}
