import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        boolean continueInput = true;
        while (continueInput) {
            System.out.print("Enter a number (or enter '0' to stop): ");
            int number = scanner.nextInt();

            if (number == 0) {
                continueInput = false;
            } else {
                // Update largest and smallest numbers
                if (number > largest) {
                    largest = number;
                }
                if (number < smallest) {
                    smallest = number;
                }

                // Update sum and count for average calculation
                sum += number;
                count++;
            }
        }

        // Check if any numbers were entered
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Average of all numbers entered: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}
