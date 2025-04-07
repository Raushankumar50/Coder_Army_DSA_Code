package assignment.day09;

class Pattern {
  public static void main(String[] args) {
    /*
      First Pattern:  
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5 
        1 2 3 4 5 6
    */
    for(int i=1;i<=6;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
    System.out.println();

    /*
     Second Pattern:
      A
      A B
      A B C
      A B C D
      A B C D E
    */
    for(int i=1;i<=5;i++){
      for(int j=1;j<=i;j++){
        char ch = (char)(65 + j - 1);
        System.out.print(ch+" ");
      }
      System.out.println();
    }
    System.out.println();

    /*
     Third Pattern:
       10
       10 11
       10 11 12
       10 11 12 13
       10 11 12 13 14
       10 11 12 13 14 15
     */
    for(int i=10;i<=15;i++){
      for(int j=10;j<=i;j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
    System.out.println();

    /*
     Fourth Pattern:
      A B C D
      A B C
      A B
      A
    */
    for(int i=4;i>=1;i--){
      for(int j=1;j<=i;j++){
        char ch = (char) (65+j-1);
        System.out.print(ch+" ");
      }
      System.out.println();
    }
    System.out.println();
  }
}