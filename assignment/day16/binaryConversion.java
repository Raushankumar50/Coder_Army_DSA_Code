package assignment.day16;

import java.util.Scanner;

public class binaryConversion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    // Decimal to binary

    // System.out.print("Enter a Decimal value : ");
    // int n = sc.nextInt();
    // int ans = 0, pw = 1;
    // while(n > 0) {
    //   int rem = n%2;
    //   ans += rem*pw;
    //   pw *= 10;
    //   n /= 2;
    // }
    // System.out.println(ans);

    // Convert Binary to Decimal
    // System.out.print("Enter a binary number : ");
    // int bn = sc.nextInt();
    // int decNum = 0, pw2 = 1;
    // while(bn > 0){
    //   int rem = bn%10;
    //   decNum += rem*pw2;
    //   pw2 *= 2;
    //   bn /= 10;
    // }
    // System.out.println("Convert Binary to Decimal is : "+decNum);


    // Convert Decimal to octal
    // System.out.print("Enter a Decimal value: ");
    // int dec = sc.nextInt();

    // int ocNum = 0, pw3 = 1;
    // while (dec > 0) {
    //   int rem = dec%8;
    //   ocNum += rem * pw3;
    //   pw3 *= 10;
    //   dec /= 8;
    // }
    // System.out.println("Convert Decimal to octal is : "+ocNum);


    // Convert Octal to Decimal
    // System.out.print("Enter a Octal value: ");
    // int oc = sc.nextInt();

    // int decNum2 = 0, pw4 = 1;
    // while(oc > 0) {
    //   int rem = oc%10;
    //   decNum2 += rem*pw4;
    //   pw4 *= 8;
    //   oc /= 10;
    // }
    // System.out.println("Convert octal to Decimal is : "+decNum2);


    // Covert Octal to Binary
    System.out.print("Enter the Octal value : ");
    int ocVal = sc.nextInt();

    int decVal = 0, pw5 = 1;
    // convert octal to decimal
    while(ocVal > 0) {
      int rem = ocVal%10;
      decVal += rem * pw5;
      pw5 *= 8;
      ocVal /= 10;
    }

    // convert decimal to binary
    int bnAns = 0, pw6 = 1;
    while(decVal > 0){
      int rem = decVal%2;
      bnAns += rem*pw6;
      pw6 *= 10;
      decVal /= 2;
    }
    System.out.println("Binary Number is : "+bnAns);
    

    sc.close();
  }
}