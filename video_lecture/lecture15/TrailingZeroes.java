package video_lecture.lecture15;

import java.util.Scanner;

public class TrailingZeroes {

  public static int countZeroes(int n){
    int ans = 0;
    while(n >= 5){
      ans += n/5;
      n /= 5;
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = sc.nextInt();

    int count = countZeroes(n);
    System.out.println("Number of Zeroes : "+count);

    sc.close();
  }
}