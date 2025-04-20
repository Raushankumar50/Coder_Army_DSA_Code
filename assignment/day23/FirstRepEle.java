package assignment.day23;

import java.util.Scanner;

public class FirstRepEle {

  public static int firstRepeatinElement(int[] arr, int n){
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i] == arr[j]){
          return i+1;
        }
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

    int idx = firstRepeatinElement(arr, n);
    System.out.println(idx);


    sc.close();
  }
}
