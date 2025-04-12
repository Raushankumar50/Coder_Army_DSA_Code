import java.util.Scanner;

class patternFour {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of N : ");
    int n = sc.nextInt();
    /*
              *        
            * * *      
          * * * * *    
        * * * * * * *  
      * * * * * * * * *
     */
    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=n-i;j++){
    //     System.out.print(" "+" ");
    //   }
    //   for(int j=1;j<=i*2-1;j++){
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    // System.out.println("The second method of this pattern");
    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=2*n-1;j++){
    //     if(j>=n+1-i && j<=n-1+i){
    //       System.out.print("* ");
    //     } else {
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();
    // }


    /*
             1
           1 2 1
         1 2 3 2 1
       1 2 3 4 3 2 1
     1 2 3 4 5 4 3 2 1
     */
    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=n-i;j++){
    //     System.out.print("  ");
    //   }
    //   for(int j=1;j<=i;j++){
    //     System.out.print(j+" ");
    //   }
    //   for(int j=i-1;j>=1;j--){
    //     System.out.print(j+" ");
    //   }
    //   System.out.println();
    // }


    /*
      * * * * * * * * *
      * * * * * * *
        * * * * *    
          * * *      
            *        
    */
    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=i-1;j++){
    //     System.out.print("  ");
    //   }
    //   for(int j=1;j<=(2*n-1)-(i-1)*2;j++){
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    // System.out.println("The second method of this pattern");
    // for(int i=n;i>=1;i--){
    //   for(int j=1;j<=n-i;j++){
    //     System.out.print("  ");
    //   }
    //   for(int j=1;j<=2*i-1;j++){
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }


    /*
     * * * * * * * *
     * * *     * * *
     * *         * *
     *             *
     *             *
     * *         * *
     * * *     * * *
     * * * * * * * *

     */
    
    // for(int i=n;i>=1;i--){
    //   for(int j=1;j<=i;j++){
    //     System.out.print("* ");
    //   }
    //   for(int j=1;j<=2*n-2*i;j++){
    //     System.out.print("  ");
    //   }
    //   for(int j=1;j<=i;j++){
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }
    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=i;j++){
    //     System.out.print("* ");
    //   }
    //   for(int j=1;j<=2*n-2*i;j++){
    //     System.out.print("  ");
    //   }
    //   for(int j=1;j<=i;j++){
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    /*

     *             *
     * *         * *
     * * *     * * *
     * * * * * * * *
     * * *     * * *
     * *         * *
     *             *
     
     */
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      for(int j=1;j<=2*n-2*i;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }

    for(int i=n-1;i>=1;i--){
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      for(int j=1;j<=2*n - 2*i;j++){
        System.err.print("  ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }

    /*
        *
       * *
      * * *
     * * * *
     * * * *
      * * *
       * *
        *
    */
    
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    for(int i=n;i>=1;i--){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }



    sc.close();
  }
}