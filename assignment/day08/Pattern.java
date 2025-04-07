package assignment.day08;

class Pattern {
  public static void main(String[] args) {
    /*
     First Pattern:

       4 4 4 4 4 4
       4 4 4 4 4 4
       4 4 4 4 4 4  
       4 4 4 4 4 4
       4 4 4 4 4 4
     */
    for(int i=1;i<=5;i++){
      for(int j=1;j<=5;j++){
        System.out.print(4+" ");
      }
      System.out.println();
    }
    System.out.println();
    /*
     Second Pattern:
   
       1 4 9 16 25
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
    System.out.println();

    /*
     Third Pattern:
      1 8 27 64 125 216
      1 8 27 64 125 216
      1 8 27 64 125 216
      1 8 27 64 125 216
      1 8 27 64 125 216
    */
    for(int i=1;i<=5;i++){
      for(int j=1;j<=6;j++){
        System.out.print(j*j*j+" ");
      }
      System.out.println();
    }
    System.out.println();

    /*
      Fourth Pattern:
        F G H I J K  
        F G H I J K
        F G H I J K
        F G H I J K
        F G H I J K
    */
    for(int i=1;i<=5;i++){
      for(char ch='F';ch<='K';ch++){
        System.out.print(ch+" ");
      }
      System.out.println();
    }
    System.out.println();
  }
}