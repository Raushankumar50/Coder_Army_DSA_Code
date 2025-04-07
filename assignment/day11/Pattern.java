package assignment.day11;

class Pattern {
  public static void main(String[] args) {
    /*
     First Pattern: Take an input n from the user, and create a pattern like below, for n=5, we have output like this.

        *
       * *
      * * *
     * * * *
    * * * * *
    */
    for(int i=1;i<=5;i++){
      for(int j=1;j<=5-i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();

    /*
     Second Pattern: Take an input n from the user, and create a pattern like below, for n=5, we have output like this.

              1
            1 2 3
          1 2 3 4 5
        1 2 3 4 5 6 7
      1 2 3 4 5 6 7 8 9
    */
    for(int i=1;i<=5;i++){
      for(int j=1;j<=5-i;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=2*i-1;j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
    System.out.println();

    /*
     Third Pattern: Take an input n from the user, and create a pattern like below, for n=5, we have output like this.
       
              A
            A B A
          A B C B A
        A B C D C B A
      A B C D E D C B A
    */
    for(int i=1;i<=5;i++){
      for(int j=1;j<=5-i;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=i;j++){
        char ch = (char)(65+j-1);
        System.out.print(ch + " ");
      }
      for(int j=1;j<=i-1;j++){
        char ch = (char)(65+i-j-1);
        System.out.print(ch + " ");
      }
      System.out.println();
    }
    System.out.println();

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
    for(int i=1;i<=4;i++){
      for(int j=1;j<=4-i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    for(int i=4;i>=1;i--){
      for(int j=1;j<=4-i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}