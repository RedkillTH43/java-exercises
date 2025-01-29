import java.util.Scanner;

public class Rectangle {
  public static void main(String[] args) {
    int width, height;
    char character;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter height: ");
    height = input.nextInt();
    System.out.print("Enter width: ");
    width = input.nextInt();
    input.nextLine();
    System.out.print("Enter character: ");
    character = input.nextLine().charAt(0);
    int i = 0;
    
    while (i < height) {
      for (int j = 0; j < width; j++) {
        System.out.print(character);
      }
      System.out.println();
      i++;
    }
  }
}