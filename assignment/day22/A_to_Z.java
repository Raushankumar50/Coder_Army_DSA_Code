package assignment.day22;

import java.util.Scanner;

public class A_to_Z {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] ch = new char[26];
     // Fill the array with letters from 'a' to 'z'
     for (int i = 0; i < 26; i++) {
      ch[i] = (char) ('A' + i); // Convert int to char
    }

    System.out.println("All A to Z character");
    for(int i=0;i<26;i++){
      System.out.print(ch[i]+" ");
    }


    sc.close();
  }
}
