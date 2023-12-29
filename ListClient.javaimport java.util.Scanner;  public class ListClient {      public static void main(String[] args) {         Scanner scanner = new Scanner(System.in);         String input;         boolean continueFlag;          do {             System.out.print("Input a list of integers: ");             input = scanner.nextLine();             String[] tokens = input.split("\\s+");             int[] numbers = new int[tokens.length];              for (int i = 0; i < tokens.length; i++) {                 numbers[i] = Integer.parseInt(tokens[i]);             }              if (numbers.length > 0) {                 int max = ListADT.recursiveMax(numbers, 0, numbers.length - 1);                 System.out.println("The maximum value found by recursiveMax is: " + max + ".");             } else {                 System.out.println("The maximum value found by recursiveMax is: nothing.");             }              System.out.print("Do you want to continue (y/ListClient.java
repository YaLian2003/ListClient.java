import java.util.Scanner;

public class ListClient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean continueFlag;

        do {
            System.out.print("Input a list of integers: ");
            input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            int[] numbers = new int[tokens.length];

            for (int i = 0; i < tokens.length; i++) {
                numbers[i] = Integer.parseInt(tokens[i]);
            }

            if (numbers.length > 0) {
                int max = ListADT.recursiveMax(numbers, 0, numbers.length - 1);
                System.out.println("The maximum value found by recursiveMax is: " + max + ".");
            } else {
                System.out.println("The maximum value found by recursiveMax is: nothing.");
            }

            System.out.print("Do you want to continue (y/n): ");
            input = scanner.nextLine();
            continueFlag = input.equalsIgnoreCase("y");
        } while (continueFlag);

        scanner.close();
    }
}
