import java.util.Scanner;

public class Password {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int inputPass;
    int password = 9876;
    do {
      System.out.print("Enter numerical password: ");
      inputPass = input.nextInt();
      if (inputPass != password) {
        System.out.println("Try again");
      }
    } while (inputPass != password);
    for (int i = 5; i >= 1; i--) {
      System.out.println(i);
    }
    System.out.println("Happy New Year!");
  }
}