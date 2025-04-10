package assignment.day17;

import java.util.Scanner;

public class powerOfTwo {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter twe Numbers : ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans = 0;
    for(int i=1;i<b;i++){
      ans = a*a;
    }
    System.out.println("Result using loop: " + ans);
    System.out.println("Result using Math.pow: " + (int)Math.pow(a, b));

    sc.close();
  }
}
