package assignment.day17;

import java.util.Scanner;

public class reverseNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a value : ");
    int n = sc.nextInt();

    int revNum = 0;
    while(n != 0){
      int rem = n%10;
      revNum = revNum*10+rem;
      n /= 10;
    }
    System.out.println("Reverse Number is : "+revNum);



    sc.close();
  }
}
