package assignment.day31;

import java.util.Scanner;

public class CubeOfRoot {

  public static int cube(int x){
    if(x==0 || x==1){
      return x;
    }

    int st = 1, end = x;
    while(st <= end){
      int mid = st + (end-st)/2;
      if((long)mid*mid*mid > (long)x){
        end = mid-1;
      } else if(mid*mid*mid == x){
        return mid;
      } else {
        st = mid+1;
      }
    }

    return Math.round(end);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a value : ");
    int x = sc.nextInt();

    System.out.println(cube(x));

    sc.close();
  }
}
