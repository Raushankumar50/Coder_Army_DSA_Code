package assignment.day26;

import java.util.Scanner;

public class BubbleSortChar {

  public static void display(char[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void charBubbleSort(char[] arr){
    int n = arr.length;
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-i-1;j++){
        if(arr[j] > arr[j+1]){
          char temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    System.out.print("Enter characters without spaces: ");
    String input = sc.nextLine();

    char[] arr = input.toCharArray();

    charBubbleSort(arr);
    display(arr);


    sc.close();
  }
}
