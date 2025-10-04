// Demonstrates different types of exception handling in Java

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {

    // 1️⃣ Example using 'throw' to create a custom exception
    static void checkAge(int age) {
        if (age < 18) {
            // Custom error message
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    // 2️⃣ Example using 'throws' to declare an exception
    static void readFile() throws FileNotFoundException {
        File file = new File("nonexistent.txt"); // file doesn't exist
        Scanner reader = new Scanner(file); // this will throw FileNotFoundException
        System.out.println(reader.nextLine());
        reader.close();
    }

    public static void main(String[] args) {

        // 3️⃣ Example of multiple catch blocks
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]); // ❌ ArrayIndexOutOfBoundsException
            int x = 10 / 0; // ❌ ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range!");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        } finally {
            // 4️⃣ 'finally' always runs — even if an exception occurs
            System.out.println("The try-catch block has finished executing.");
        }

        // 5️⃣ Testing 'throw'
        try {
            checkAge(15); // ❌ will throw exception
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        checkAge(20); // ✅ allowed

        // 6️⃣ Handling 'throws' using try-catch
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        System.out.println("Program continues normally...");
    }
}
