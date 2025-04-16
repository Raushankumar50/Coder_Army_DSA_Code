package assignment.day23;

import java.util.Scanner;

public class smallestPosNum {

  public static int missingPositiveNumber(int[] arr){
    int posNum = 0, n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                posNum++;
            }
        }
        
        int[] nums = new int[posNum];
        int idx = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                nums[idx++] = arr[i];
            }
        }
        
        // Check for the smallest missing positive number
        for(int i=1;i<=posNum;i++){
            boolean found = false;
            for(int j=0;j<posNum;j++){
                if(nums[j] == i){
                    found = true;
                    break;
                }
            }
            
            if(!found){
                return i;
            }
        }
        
        return posNum+1;
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

    int num = missingPositiveNumber(arr);
    System.out.println("Smallest Positive Number : "+num);


    sc.close();
  }
}