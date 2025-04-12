package video_lecture.lecture15;

import java.util.Scanner;

public class NimGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = sc.nextInt();

    if(n%4 != 0) {
      System.out.println("Game has been win");
    } else {
      System.out.println("Game has not been won");
    }

    sc.close();
  }
}
