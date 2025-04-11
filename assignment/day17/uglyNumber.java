package assignment.day17;

import java.util.Scanner;

public class uglyNumber {
  
  public static boolean ugly(int n){
    if(n<=0) return false;
    while(n > 1){
      if(n%2==0){
        n /= 2;
      } else if(n%3==0){
        n /= 3;
      } else if(n%5==0){
        n /= 5;
      } else {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = sc.nextInt();

    if(ugly(n)){
      System.out.println(n+" is a ugly Number");
    } else {
      System.out.println(n+" is not a ugly Number");
    }
    

    sc.close();
  }
}
