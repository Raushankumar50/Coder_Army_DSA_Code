package video_lecture.lecture15;

import java.util.Scanner;

public class BishopMoves {

  public static int countMoves(int a, int b){
    int count = 0;
    count += Math.min(8-a,8-b);
    count += Math.min(8-a, b-1);
    count += Math.min(a-1, b-1);
    count += Math.min(a-1, 8-b);

    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two values : ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("Number of moves : "+countMoves(a,b));

    sc.close();
  }
}
