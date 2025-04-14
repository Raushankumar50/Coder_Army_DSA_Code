package video_lecture.lecture17Array;

import java.util.Scanner;

public class userIO {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input for int
    System.out.print("Enter an integer: ");
    int myInt = sc.nextInt();

    // Input for float
    System.out.print("Enter a float: ");
    float myFloat = sc.nextFloat();

    // Input for double
    System.out.print("Enter a double: ");
    double myDouble = sc.nextDouble();

    // Input for String (single word)
    System.out.print("Enter a word: ");
    String word = sc.next(); // Stops reading at space

    // Input for full line
    sc.nextLine(); // consume the leftover newline
    System.out.print("Enter a full line of text: ");
    String line = sc.nextLine();

    // Input for char (by taking first character of input string)
    System.out.print("Enter a character: ");
    char myChar = sc.next().charAt(0);

    // Input for array of integers
    System.out.print("Enter size of the integer array: ");
    int size = sc.nextInt();
    int[] intArray = new int[size];

    System.out.println("Enter " + size + " integers:");
    for (int i = 0; i < size; i++) {
        intArray[i] = sc.nextInt();
    }

    // Output the inputs
    System.out.println("\nYou entered:");
    System.out.println("Integer: " + myInt);
    System.out.println("Float: " + myFloat);
    System.out.println("Double: " + myDouble);
    System.out.println("Word: " + word);
    System.out.println("Line: " + line);
    System.out.println("Character: " + myChar);
    System.out.print("Array: ");
    for (int num : intArray) {
        System.out.print(num + " ");
    }
    System.out.println();

    sc.close();
  }
}