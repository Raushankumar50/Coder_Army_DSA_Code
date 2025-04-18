import java.util.Scanner;

class pattern_one {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    

    // * * * * *
    // for(int i=1;i<=5;i++){
    //   System.out.print("* ");
    // }

    /* 
      * * * * *
      * * * * *
      * * * * *
      * * * * *
      * * * * *
     */
    // System.out.print("Enter the value : ");
    // int a = sc.nextInt();
    //  for(int i=1;i<=a;i++){
    //   for(int j=1;j<=a;j++){
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    //  }

    /*
     10 10 10 10 10
     10 10 10 10 10
     10 10 10 10 10
     10 10 10 10 10
     */
    //  for(int i=1;i<=4;i++){
    //   for(int j=1;j<=5;j++){
    //     System.out.print(10+" ");
    //   }
    //   System.out.println();
    //  }

    /*
     1 1 1 1 1
     2 2 2 2 2
     3 3 3 3 3
     4 4 4 4 4
     5 5 5 5 5
     */
    //  for(int i=1;i<=5;i++){
    //   for(int j=1;j<=5;j++){
    //     System.out.print(i+" ");
    //   }
    //   System.out.println();
    //  }

    /*
     1 2 3 4 5
     1 2 3 4 5
     1 2 3 4 5
     1 2 3 4 5
     1 2 3 4 5
     */
    //  for(int i=1;i<=5;i++){
    //   for(int j=1;j<=5;j++){
    //     System.out.print(j+" ");
    //   }
    //   System.out.println();
    //  }

    /*
     5 4 3 2 1
     5 4 3 2 1
     5 4 3 2 1
     5 4 3 2 1
     5 4 3 2 1
     */
    // for(int i=1;i<=5;i++){
    //   for(int j=5;j>=1;j--){
    //     System.out.print(j+" ");
    //   }
    //   System.out.println();
    // }

    /*
     1 4 9 16 25
     1 4 9 16 25
     1 4 9 16 25
     1 4 9 16 25
     1 4 9 16 25
     */
    for(int i=1;i<=5;i++){
      for(int j=1;j<=5;j++){
        System.out.print(j*j+" ");
      }
      System.out.println();
    }

    /*
     1 8 27 64 125
     1 8 27 64 125
     1 8 27 64 125
     1 8 27 64 125
     1 8 27 64 125
     */
    // for(int i=1;i<=5;i++){
    //   for(int j=1;j<=5;j++){
    //     System.out.print(j*j*j+" ");
    //   }
    //   System.out.println();
    // }

    /*
     a a a a a
     b b b b b
     c c c c c
     d d d d d
     e e e e e
     */
    //  for(int i=1;i<=5;i++){
    //   char ch = (char)('a'+i-1);
    //   for(int j=1;j<=5;j++){
    //     System.out.print(ch+" ");
    //   }
    //   System.out.println();
    //  }

    /*
     a b c d e
     a b c d e
     a b c d e
     a b c d e
     a b c d e
     */
    // for(int i=1;i<=5;i++){
    //   for(int j=1;j<=5;j++){
    //     char ch = (char)('a'+j-1);
    //     System.out.print(ch+" ");
    //   }
    //   System.out.println();
    // }

    // for(int i=1;i<=5;i++){
    //   for(int j=97;j<=101;j++){
    //     System.out.print((char)j+ " ");
    //   }
    //   System.out.println();
    // }

    /*
     1 2 3 4 5
     6 7 8 9 10
     11 12 13 14 15
     16 17 18 19 20
     21 22 23 24 25
     */
    // int count = 1;
    // for(int i=1;i<=5;i++){
    //   for(int j=1;j<=5;j++){
    //     // System.out.print(count++ + " ");
    //     System.out.print((i-1)*5 + j +" ");
    //   }
    //   System.out.println();
    // }


     sc.close();
  }
}