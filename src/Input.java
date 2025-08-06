import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for and read the user's name
        System.out.println("Enter your Name:");
        String name = scanner.nextLine();

        System.out.println("Hello I am " + name);

        // Ask for and read the integer input
        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        // Compute and print powers of n
        System.out.println(n * n);           // square
        System.out.println(n * n * n);       // cube
        System.out.println(n * n * n * n);   // fourth power

        scanner.close();
    }
}
