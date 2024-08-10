import java.util.Scanner;

public class Call {
    public static void main(String[] args) {
        int minutes;
        int totalCharge = 0;
        String callType;
        String hourType;
        Scanner input = new Scanner(System.in);

        System.out.print("Input minutes: ");
        minutes = Integer.parseInt(input.nextLine());

        System.out.print("Input call type: ");
        callType = input.nextLine();

        System.out.print("Input hour type: ");
        hourType = input.nextLine();

        if (compare(callType.toCharArray(), "same network".toCharArray())) {
            if (compare(hourType.toCharArray(), "peak hours".toCharArray())) {
                totalCharge = minutes * 3;
            }
            else {
                totalCharge = minutes * 8;
            }
        }
        else if (compare(callType.toCharArray(), "other network".toCharArray())) {
            if (compare(hourType.toCharArray(), "peak hours".toCharArray())) {
                totalCharge = minutes * 4;
            }
            else {
                totalCharge = minutes * 8;
            }
        }
        else if (compare(callType.toCharArray(), "landline call".toCharArray())) {
            if (compare(hourType.toCharArray(), "peak hours".toCharArray())) {
                totalCharge = minutes * 4;
            }
            else {
                totalCharge = minutes * 8;
            }
        }
        else if (compare(callType.toCharArray(), "ndd".toCharArray())) {
            if (compare(hourType.toCharArray(), "peak hours".toCharArray())) {
                totalCharge = minutes * 7;
            }
            else {
                totalCharge = minutes * 11;
            }
        }
        else if (compare(callType.toCharArray(), "idd".toCharArray())) {
            if (compare(hourType.toCharArray(), "peak hours".toCharArray())) {
                totalCharge = minutes * 20;
            }
            else {
                totalCharge = minutes * 20;
            }
        }
        else {
            System.out.println("Invalid call type");
        }
        System.out.println("Total charge: " + totalCharge);
    }

    public static boolean compare(char[] input, char[] text) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] != text[i]) {
                return false;
            }
        }
        return true;
    }
}
