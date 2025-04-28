package assignment.day25;

import java.util.Scanner;

public class SelectionSortChar {

  public static void display(char[] arr){
    for(char ch : arr){
      System.out.print(ch+" ");
    }
    System.out.println();
  }

  public static void charSelectionSort(char[] arr){
    int n = arr.length;
    for(int i=0;i<n-1;i++){
      int min_idx = i;
      for(int j=i+1;j<n;j++){
        if(arr[j] < arr[min_idx]){
          min_idx = j;
        }
      }

      // swap character
      char temp = arr[i];
      arr[i] = arr[min_idx];
      arr[min_idx] = temp;
    }

    display(arr);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    System.out.print("Enter characters without spaces: ");
    String input = sc.nextLine();

    char[] arr = input.toCharArray();

    display(arr);
    charSelectionSort(arr);
        

    sc.close();
  }
}
