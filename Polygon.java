import java.util.Scanner;

public class Polygon {
  public static void main(String[] args) {
    int side;
    String type;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter sides for a polygon: ");
    side = input.nextInt();

    switch (side) {
      case 3:
        type = "Triangle";
        break;
      case 4:
        type = "Square";
        break;
      case 5:
        type = "Pentagon";
        break;
      case 6:
        type = "Hexagon";
        break;
      case 7:
        type = "Heptagon";
        break;
      case 8:
        type = "Octagon";
        break;
      case 9:
        type = "Nonagon";
        break;
      case 10:
        type = "Decagon";
        break;
      default:
        type = "not supported";
        break;
    }
    System.out.println("Polygon is type " + type);
  }
}