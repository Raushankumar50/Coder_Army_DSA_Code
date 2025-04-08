package assignment.day16;

import java.util.Scanner;

public class binaryConversion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a value : ");
    int n = sc.nextInt();

    // Decimal to binary
    int ans = 0, pw = 1;
    while(n > 0) {
      int rem = n%2;
      ans += rem*pw;
      pw *= 10;
      n /= 2;
    }

    System.out.println(ans);

    System.out.print("Enter a binary number : ");
    int bn = sc.nextInt();
    int decNum = 0, pw2 = 1;
    while(bn > 0){
      int rem = bn%10;
      decNum += rem*pw2;
      pw2 *= 2;
      bn /= 10;
    }
    System.out.println(decNum);
    

    sc.close();
  }
}