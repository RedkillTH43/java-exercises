import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    double num1, num2, result = 0;
    char operation;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 1st number: ");
    num1 = input.nextInt();
    System.out.print("Enter 2nd number: ");
    num2 = input.nextInt();
    input.nextLine();
    System.out.print("Choose operations: ");
    operation = input.nextLine().charAt(0);
    
    switch (operation) {
      case '+':
        result = Add(num1, num2);
        break;
      case '-':
        result = Subtract(num1, num2);
        break;
      case '*':
        result = Multiply(num1, num2);
        break;
      case '/':
        result = Divide(num1, num2);
        break;
      case '%':
        result = Modulus(num1, num2);
        break;
      default:
        System.out.println("Invalid operation.");
        break;
    }
    System.out.println("The result is: " + result);
  }
    
    public static double Add(double _num1, double _num2) {
      double _result = _num1 + _num2;
      return _result;
    }
    public static double Subtract(double _num1, double _num2) {
      double _result = _num1 - _num2;
      return _result;
    }
    public static double Multiply(double _num1, double _num2) {
      double _result = _num1 * _num2;
      return _result;
    }
    public static double Divide(double _num1, double _num2) {
      double _result = _num1 / _num2;
      return _result;
    }
    public static double Modulus(double _num1, double _num2) {
      double _result = _num1 % _num2;
      return _result;
    }
}