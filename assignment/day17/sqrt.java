package assignment.day17;

import java.util.Scanner;

public class sqrt {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();

    System.out.println(Math.sqrt(n));

    sc.close();
  }
}
