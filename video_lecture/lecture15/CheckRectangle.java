package video_lecture.lecture15;

import java.util.Scanner;

public class CheckRectangle {

  public static boolean isRactangel(int a, int b, int c, int d){
    if((a==b && c==d) || (a==c && b==d) || (a==d && b==c)){
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter four sides : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    boolean isRec = isRactangel(a,b,c,d);
    if(isRec){
      System.out.println("This is a Rectangle");
    } else {
      System.out.println("This is not a Rectangel");
    }

    sc.close();
  }
}
