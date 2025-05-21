package assignment.day75recursion;

import java.util.Scanner;

public class GCD {

  public static int gcd(int a, int b){
    if(a==0) return b;
    if(b==0) return a;
    if(a==b) return a;

    if(a>b){
      return gcd(a-b,b);
    }

    return gcd(a,b-a);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two numbers a & b : ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans = gcd(a,b);
    System.out.println(ans);
  }
}
