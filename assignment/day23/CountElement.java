package assignment.day23;

import java.util.Scanner;

public class CountElement {

  public static int countElement(int[] arr, int num1, int num2){
    if(arr.length == 0){
      return 0;
    }

    int left = 0, right = arr.length-1;
    for(int i=0;i<arr.length;i++){
      if(num1 == arr[i]){
        left = i;
      }
      if(num2 == arr[i]){
        right = i;
      }
    }

    return right-left-1;
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

    System.out.print("Enter two Elements : ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int count = countElement(arr, num1, num2);
    System.out.println("Number of Elements are "+ count +" between "+num1+" and "+num2);


    sc.close();
  }
}
