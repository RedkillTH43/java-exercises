import java.util.Scanner;

public class Age {
  public static void main(String[] args) {
    int age;
    Scanner input = new Scanner(System.in);
    System.out.print("Age: ");
    age = input.nextInt();
    
    if (age >= 60) {
      System.out.println("Enjoy Retirement");
    }
    else if (age >= 50 && age <= 59) {
      System.out.println("Golden Age");
    }
    else if (age >= 40 && age <= 49) {
      System.out.println("Life Begins at 40");
    }
    else if (age >= 30 && age <= 39) {
      System.out.println("Hard Working");
    }
    else if (age >= 20 && age <= 29) {
      System.out.println("Enjoy Life");
    }
    else if (age <= 19) {
      System.out.println("Study Hard");
    }
    else{
      System.out.println("Invalid age");
    }
  }
}