package assignment.day10;

class Pattern {
  public static void main(String[] args) {
    /*
     First Pattern: Take an input n from the user, and create a pattern like below, for n=5, we have output like this.

                1
              2 1
            3 2 1
          4 3 2 1
        5 4 3 2 1
     */
    for(int i=1;i<=5;i++){
      for(int j=1;j<=5-i;j++){
        System.out.print("  ");
      }
      for(int j=i;j>=1;j--){
        System.out.print(j+" ");
      }
      System.out.println();
    }
    System.out.println();

    /*
     Second Pattern: Take an input n from the user, and create a pattern like below, for n=5, we have output like this.    
                A
              B B
            C C C
          D D D D
        E E E E E
    */
    for(int i=1;i<=5;i++){
      char ch = (char)(65+i-1);
      for(int j=1;j<=5-i;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=i;j++){
        System.out.print(ch+" ");
      }
      System.out.println();
    }
    System.out.println();

    /*
     Third Pattern: Take an input n from the user, and create a pattern like below, for n=5, we have output like this.
                5
              5 4
            5 4 3
          5 4 3 2 
        5 4 3 2 1
    */
    for(int i=5;i>=1;i--){
      for(int j=1;j<=i-1;j++){
        System.out.print("  ");
      }
      for(int j=5;j>=i;j--){
        System.out.print(j+" ");
      }
      System.out.println();
    }
    System.out.println();

    /*
     Fourth Pattern: Take an input n from the user, and create a pattern like below, for n=5, we have output like this.
              E
            E D
          E D C
        E D C B
      E D C B A
    */
    for(int i=1;i<=5;i++){
      for(int j=1;j<=5-i;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=i;j++){
        char ch = (char)(69-j+1);
        System.out.print(ch+" ");
      }
      System.out.println();
    }
    System.out.println();
  }
}