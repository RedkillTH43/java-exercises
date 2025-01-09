import java.util.Scanner;

public class FullProfile
{
  public static void main(String[] args)
  {
    String firstName, lastName, course, address, temp;
    char midInitial;
    int birthYear, age;
    long lrn;
    Scanner input = new Scanner(System.in);
    
    System.out.print("First Name: ");
    firstName = input.nextLine();
    
    System.out.print("Middle Initial: ");
    midInitial = input.nextLine().charAt(0);
    
    System.out.print("Last Name: ");
    lastName = input.nextLine();
    
    System.out.print("LRN: ");
    lrn = input.nextLong();
    
    System.out.print("Course: ");
    course = input.nextLine();
    course = input.nextLine();
    
    System.out.print("Address: ");
    address = input.nextLine();
    
    System.out.print("Birth Year: ");
    birthYear = input.nextInt();
    
    age = 2025 - birthYear;
    
    System.out.println("You are " + firstName + " " + midInitial + ". " + lastName + " with " + lrn + " LRN number of " + course + " course that lives in " + address + " and you are already " + age + " years old.");
  }
}