package video_lecture.lecture15;

import java.util.Scanner;

public class Armstrong {
  public static int countDigit(int n){
    int count = 0;
    while(n != 0){
      count++;
      n /= 10;
    }
    return count;
  }

  public static boolean armstrong(int digit, int n){
    int ans = 0, num = n;
    while(n != 0){
      int rem = n%10;
      ans += (int)Math.pow(rem,digit);
      n /= 10;
    }
    if(ans == num) return true;
    return false;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = sc.nextInt();

    int digit = countDigit(n);
    if(armstrong(digit, n)){
      System.out.println(n+" is a Armstrong Number");
    } else {
      System.out.println(n+" is not a Armstrong Number");
    }

    sc.close();
  }
}
