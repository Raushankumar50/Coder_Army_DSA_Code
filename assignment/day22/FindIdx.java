package assignment.day22;

import java.util.Scanner;

public class FindIdx {

  public static int findIdx(int[] arr, int x, int n){
    int idx = -1;
    for(int i=0;i<n;i++){
      if(arr[i] == x){
        return i;
      }
    }
    return idx;
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

    System.out.print("Enter a target value : ");
    int x = sc.nextInt();
    int idx = findIdx(arr,x, n);
    System.out.println("Index of "+x+" is : "+idx);



    sc.close();
  }
}
