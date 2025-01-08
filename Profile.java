/* Write a program that will ask your name, last name, and lucky 
number and display all the input. */

import java.util.Scanner;

public class Profile {
  public static void main(String[] args) {
    String firstName, lastName;
    int luckyNumber;
    
    Scanner input = new Scanner(System.in);
    System.out.print("First Name: ");
    firstName = input.nextLine();
    System.out.print("Last Name: ");
    lastName = input.nextLine();
    System.out.print("Lucky Number: ");
    luckyNumber = input.nextInt();
    
    System.out.println("Hello " + firstName + " " + lastName + "!");
    System.out.println("Your lucky number is: " + luckyNumber);
  }
}