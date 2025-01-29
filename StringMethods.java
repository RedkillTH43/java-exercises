import java.util.Scanner;

public class StringMethods {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String firstWord, secondWord, sentence;
    
    System.out.print("Enter first string: ");
    firstWord = input.nextLine();
    System.out.print("Enter second string: ");
    secondWord = input.nextLine();
    
    sentence = firstWord + " " + secondWord;
    
    System.out.println(sentence.concat(" to all"));
    System.out.println(sentence.toUpperCase());
    System.out.println(sentence.replace("a", "o"));
    System.out.println("Length is: " + sentence.length());
    System.out.println(sentence.toLowerCase());
    System.out.println(sentence.substring(0, 6));
    System.out.println(sentence.substring(0, 3));
  }
}