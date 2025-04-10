package assignment.day17;

import java.util.Scanner;

public class addDigit {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the value : ");
    int n = sc.nextInt();

    while(n > 9){
      int ans = 0;
      while(n > 0){
        int dig = n%10;
        ans += dig;
        n /= 10;
      }
      n = ans;
    }
    System.out.println(n);



    sc.close();
  }
}
