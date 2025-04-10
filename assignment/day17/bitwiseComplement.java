package assignment.day17;

import java.util.Scanner;

public class bitwiseComplement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();

    int ans = 0, pw = 1;

    while(n != 0){
      int rem = n%2;
      rem = rem ^ 1;
      n /= 2;
      ans = ans+rem*pw;
      pw *= 2;
    }

    System.out.println(ans);


    sc.close();
  }
}
