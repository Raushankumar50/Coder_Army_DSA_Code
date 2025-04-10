package assignment.day17;

import java.util.Scanner;

public class palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();

    int temp = n, rev = 0;
    while(temp != 0){
      int rem = temp%10;
      rev = rev*10+rem;
      temp /= 10; 
    }

    if(rev == n) System.out.println(n+" is a Palindrome Number");
    else System.out.println(n+" is not a Palindrome Number");

    sc.close();
  }
}
