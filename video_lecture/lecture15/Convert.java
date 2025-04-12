package video_lecture.lecture15;

import java.util.Scanner;

public class Convert {

  public static void convert(char ch){
    int ans = (ch-'a')+'A';
    System.out.println((char)ans);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    System.out.println((int)ch);
    convert(ch);

    sc.close();
  }
}
