import java.util.ArrayList;
import java.util.Scanner;

public class Projects {

    // Method to multiply two numbers
    static int times(int a, int b) {
        return a * b;
    }

    // Method to greet user by name
    static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- MENU SECTION ---
        System.out.println("========= JAVA PROJECT MENU =========");
        System.out.println("1. Work with Lengths");
        System.out.println("2. Work with Marks");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();
        System.out.println("====================================");

        // --- CHOICE 1: LENGTHS PROGRAM ---
        if (choice == 1) {
            ArrayList<Integer> lengths = new ArrayList<>();

            System.out.print("How many lengths are you going to enter? ");
            int n = scanner.nextInt();

            System.out.println("Enter " + n + " lengths:");
            for (int i = 0; i < n; i++) {
                int length = scanner.nextInt();
                lengths.add(length);
            }

            // Calculate the sum of lengths
            int sum = 0;
            for (int length : lengths) {
                sum += length;
            }

            // Calculate the average
            double avg = (double) sum / lengths.size();

            // Display results
            System.out.println("\nThe sum of the lengths is: " + sum);
            System.out.println("The average length is: " + avg);
        }

        // --- CHOICE 2: MARKS PROGRAM ---
        else if (choice == 2) {
            // Get user's name and two numbers for multiplication
            System.out.println("Enter your name:");
            String name = scanner.next();

            System.out.println("Enter the first number:");
            int a = scanner.nextInt();

            System.out.println("Enter the second number:");
            int b = scanner.nextInt();

            // Call methods
            String greeting = greet(name);
            int product = times(a, b);

            // --- MARKS INPUT SECTION ---
            ArrayList<Integer> marks = new ArrayList<>();
            System.out.print("\nHow many marks will you enter? ");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter mark #" + (i + 1) + ": ");
                int mark = scanner.nextInt();
                marks.add(mark);
            }

            // Display all marks entered
            System.out.println("\nAll Marks:");
            for (Integer mark : marks) {
                System.out.println(mark);
            }

            // Remove a specific mark (example: 43) if it exists
            marks.remove(Integer.valueOf(43));

            // Calculate the sum and average
            int sum = 0;
            for (int mark : marks) {
                sum += mark;
            }

            double average = (double) sum / marks.size();

            // Find highest and lowest marks
            int max = marks.get(0);
            int min = marks.get(0);

            for (int mark : marks) {
                if (mark > max) max = mark;
                if (mark < min) min = mark;
            }

            // Display marks above average
            System.out.println("\nMarks above average:");
            for (int mark : marks) {
                if (mark > average) {
                    System.out.println(mark);
                }
            }

            // Display final results
            System.out.println("\nAverage: " + average);
            System.out.println("Highest mark: " + max);
            System.out.println("Lowest mark: " + min);

            // --- SWITCH STATEMENT EXAMPLE ---
            String day = "Monday";
            System.out.println("\nChecking the day of the week:");
            switch (day) {
                case "Monday":
                    System.out.println("Start of the week!");
                    break;
                case "Tuesday":
                    System.out.println("Second day of the week!");
                    break;
                default:
                    System.out.println("Not a valid day!");
            }

            // Final greeting and multiplication result
            System.out.println("\n" + greeting + " The multiplication of " + a + " and " + b + " is " + product);
        }

        // --- INVALID CHOICE HANDLING ---
        else {
            System.out.println("Invalid choice! Please restart and choose 1 or 2.");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
