package video_lecture.lecture22_bn_search;

import java.util.Scanner;

public class BinarySearch {

  public static void display(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static int binarySearch(int[] arr, int x){
    int st = 0, end = arr.length-1;
    while(st <= end){
      int mid = st + (end-st)/2;
      if(arr[mid] == x){
        return mid;
      } else if(arr[mid] > x){
        end = mid-1;
      } else {
        st = mid+1;
      }
    }
    return -1;
  } 

  public static void sortArray(int[] arr, int n){
    for(int i=1;i<n;i++){
      int j = i;
      while(j>0 && arr[j]<arr[j-1]){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        j--;
      }
    }
  }

  public static int binarySearchDesc(int[] arr, int x){
    int st = 0, end = arr.length-1;
    while(st <= end){
      int mid = st + (end-st)/2;
      if(arr[mid] == x){
        return mid;
      } else if(arr[mid] > x){
        st = mid+1;
      } else {
        end = end-1;
      }
    }
    return -1;
  }

  public static void sortArrayDesc(int[] arr, int n){
    for(int i=0;i<n;i++){
      int j = i;
      while(j>0 && arr[j]>arr[j-1]){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        j--;
      }
    }
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

    System.out.print("Enter a number what you want to search : ");
    int x = sc.nextInt();


    // Sort in accending order

    sortArray(arr,n);
    display(arr);
    int idx = binarySearch(arr, x);
    System.out.println(idx);

    // Sort in descending order

    // sortArrayDesc(arr, n);
    // display(arr);
    // int idx2 = binarySearchDesc(arr, x);
    // System.out.println(idx2);



    sc.close();
  }
}
