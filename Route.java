import java.util.Scanner;

public class Route {
    public static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.print("Destination: ");
        String destination = input.nextLine();
        System.out.print("Rate Type: ");
        String rateType = input.nextLine();

        if (destination == "Bayan") {
            if (rateType == "Regular Rate") {
                System.out.println("Amount: 12.00");

            }
        }
    }
}
