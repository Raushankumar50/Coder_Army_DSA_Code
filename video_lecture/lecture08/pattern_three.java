import java.util.Scanner;

class pattern_three {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    /*
             *
           * *
         * * *
       * * * *
     * * * * *
     */
    // System.out.print("Enter a value : ");
    // int n = sc.nextInt();

    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=n-i;j++){
    //     System.out.print(" "+" ");
    //   }
    //   for(int j=1;j<=i;j++){
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    /*
           1
         2 2
       3 3 3 
     4 4 4 4
     */
    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=n-i;j++){
    //     System.out.print(" "+" ");
    //   }
    //   for(int j=1;j<=i;j++){
    //     System.out.print(i+" ");
    //   }
    //   System.out.println();
    // }

      /*
              1
            1 2
          1 2 3 
        1 2 3 4
      1 2 3 4 5
     */
    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=n-i;j++){
    //     System.out.print(" "+" ");
    //   }
    //   for(int j=1;j<=i;j++){
    //     System.out.print(j+" ");
    //   }
    //   System.out.println();
    // }

    /*
             A
           A B
         A B C
       A B C D
     A B C D E
    */
    // for(int i=1;i<=5;i++){
    //   for(int j=1;j<=5-i;j++){
    //     System.out.print(" "+" ");
    //   }
    //   // for(char ch='A';ch<='A'+i-1;ch++){
    //   //   System.out.print(ch+" ");
    //   // }
    //   for(int j=1;j<=i;j++){
    //     char ch = (char)('A'+j-1);
    //     System.out.print(ch+" ");
    //   }
    //   System.out.println();
    // }

    /*
             1
           2 1
         3 2 1
       4 3 2 1
     5 4 3 2 1
     */
    for(int i=1;i<=5;i++){
      for(int j=1;j<=5-i;j++){
        System.out.print(" "+" ");
      }
      for(int j=i;j>=1;j--){
        System.out.print(j+" ");
      }
      System.out.println();
    }

    sc.close();
  }
}