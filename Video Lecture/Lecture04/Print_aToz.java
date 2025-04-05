import java.util.Scanner;

class Print_aToz {
  public static void main(String[] args) {
    for(char i='a';i<='z';i+=1){
      System.out.print(i+" ");
    }
    System.out.println();
    for(char i='A';i<='Z';i+=1){
      System.out.print(i+" ");
    }
    System.out.println();




    for(int i=97;i<=122;i++){
      System.out.print((char)i+" ");
    }
    System.out.println();
    for(int i=65;i<=90;i++){
      System.out.print((char)i+" ");
    }
    System.out.println();


    // Table
    Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the table value : ");
    // int n = sc.nextInt();
    // for(int i=1;i<=10;i++){
    //   System.out.println(n+" X "+i+" = "+n*i);
    // }


    // Power
    System.out.print("Enter the value a and b : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int num = a;
    for(int i=1;i<b;i++){
      num = num*a;
    }
    System.out.println(num);
    sc.close();
  }
}